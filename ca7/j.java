package ca7.j;
import java.io.File;
import java.nio.charset.Charset;
import java.lang.String;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.Reader;
import ca7.u;
import java.io.Closeable;
import ca7.e;

public final class j	// class@00051c
{

    public static String a(File p0,Charset p1){
       FileInputStream uFileInputSt = new FileInputStream(p0);
       InputStreamReader inputStreamR = new InputStreamReader(uFileInputSt, p1);
       BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
       e.a(uBufferedRea);
       e.a(inputStreamR);
       e.a(uFileInputSt);
       return u.a(uBufferedRea.readLine());
    }
}
