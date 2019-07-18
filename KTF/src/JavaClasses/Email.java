package JavaClasses;

import KhonaTokig.LogIn;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
    session ssn = new session();
    LogIn s = new LogIn();
    String aa = ssn.getEmail();
    public void sendMail(String address, String subject, String message ) throws Exception{
    
    String from ="ordercompany66@gmail.com";
    String pass ="rakib2015"; 
    String[] to = {address} ;
    String host = "smtp.gmail.com";
    
    
    Properties prop = System.getProperties();
    prop.put("mail.smtp.starttls.enable","true");
    prop.put("mail.smtp.host",host);
    prop.put("mail.smtp.user",from);
    prop.put("mail.smtp.password",pass);
    prop.put("mail.smtp.port","587");
    prop.put("mail.smtp.auth","true");
    
    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
    
            Session session = Session.getDefaultInstance(prop);
            //mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] toaddress = new InternetAddress[to.length];
            
            for (int i = 0; i < to.length; i++) {
                toaddress[i] = new InternetAddress(to[i]);
            }
            
            for (InternetAddress toaddres : toaddress) {
            msg.setRecipients(Message.RecipientType.TO, toaddress);
            }
    
            
            msg.setSubject(subject);
            msg.setContent(message,"text/html; charset=utf-8");
            Transport transport = session.getTransport("smtp");
            
            transport.connect(host,from,pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            
            
    
    }
    
}
