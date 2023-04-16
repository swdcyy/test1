package okhttp3.internal.http2.Header;
import java.lang.String;
import okio.ByteString;
import java.lang.Object;
import okhttp3.internal.Util;

public final class Header	// class@001f99
{
    public final int hpackSize;
    public final ByteString name;
    public final ByteString value;
    public static final ByteString PSEUDO_PREFIX;
    public static final ByteString RESPONSE_STATUS;
    public static final ByteString TARGET_AUTHORITY;
    public static final ByteString TARGET_METHOD;
    public static final ByteString TARGET_PATH;
    public static final ByteString TARGET_SCHEME;

    static {
       Header.PSEUDO_PREFIX = ByteString.encodeUtf8(":");
       Header.RESPONSE_STATUS = ByteString.encodeUtf8(":status");
       Header.TARGET_METHOD = ByteString.encodeUtf8(":method");
       Header.TARGET_PATH = ByteString.encodeUtf8(":path");
       Header.TARGET_SCHEME = ByteString.encodeUtf8(":scheme");
       Header.TARGET_AUTHORITY = ByteString.encodeUtf8(":authority");
    }
    public void Header(String p0,String p1){
       super(ByteString.encodeUtf8(p0), ByteString.encodeUtf8(p1));
    }
    public void Header(ByteString p0,String p1){
       super(p0, ByteString.encodeUtf8(p1));
    }
    public void Header(ByteString p0,ByteString p1){
       super();
       this.name = p0;
       this.value = p1;
       this.hpackSize = (p0.size() + 32) + p1.size();
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Header && (this.name.equals(p0.name) && this.value.equals(p0.value))) {
          b = true;
       }
    label_001c :
       return b;
    }
    public int hashCode(){
       return (((527 + this.name.hashCode()) * 31) + this.value.hashCode());
    }
    public String toString(){
       Object[] objArray = new Object[]{this.name.utf8(),this.value.utf8()};
       return Util.format("%s: %s", objArray);
    }
}
