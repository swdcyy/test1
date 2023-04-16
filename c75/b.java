package c75.b;
import android.content.ContentValues;

public interface abstract b	// class@000424
{
    public static final String d0;
    public static final byte[] e0;
    public static final byte[] f0;

    static {
       byte[] uobyteArray = new byte[0];
       b.f0 = uobyteArray;
    }
    ContentValues toContentValues();
    void updateByContentValues(ContentValues p0);
}
