package bd5.b;
import bd5.b$a;
import java.lang.String;

public interface abstract b	// class@000460
{
    public static final b a;

    static {
       b.a = new b$a();
    }
    void onDismiss();
    void onFail(int p0,String p1);
    void onShow();
}
