import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.auth.AuthMethod;
import com.nexmo.client.auth.TokenAuthMethod;
import com.nexmo.client.sms.SmsSubmissionResult;
import com.nexmo.client.sms.messages.TextMessage;

import java.io.IOException;

public class NexmoSms {

    private final static String API_KEY = "90f3214c";

    private final static String API_SECRET = "3b7a016c72e5163f";

    private final static String FROM_NUMBER = "8617610016050";
    private final static String TO_NUMBER = "8613020005357";

    public static void main(String[] args) throws IOException, NexmoClientException {
        AuthMethod auth = new TokenAuthMethod(API_KEY, API_SECRET);
        NexmoClient client = new NexmoClient(auth);
        TextMessage message = new TextMessage("NEXMO", FROM_NUMBER, "你好,this is a test !");

        SmsSubmissionResult[] results = client.getSmsClient().submitMessage(message);

        for (SmsSubmissionResult result : results) {
            System.out.println("=====>"+result);
        }


    }
}
