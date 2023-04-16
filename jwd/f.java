package jwd.f;
import java.lang.String;
import java.util.Iterator;

public interface abstract f	// class@001750
{

    byte[] getContent();
    String getFieldValue(String p0);
    boolean hasFieldValue(String p0);
    Iterator iterateHttpFields();
}
