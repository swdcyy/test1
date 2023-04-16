package okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Header;
import okio.ByteString;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.util.Collections;

public final class Hpack	// class@001f9c
{
    public static final Map NAME_TO_FIRST_INDEX;
    public static final Header[] STATIC_HEADER_TABLE;

    static {
       Header[] headerArray = new Header[61];
       headerArray[0] = new Header(Header.TARGET_AUTHORITY, "");
       ByteString tARGET_METHO = Header.TARGET_METHOD;
       headerArray[1] = new Header(tARGET_METHO, "GET");
       Header header = new Header(tARGET_METHO, "POST");
       headerArray[2] = header;
       tARGET_METHO = Header.TARGET_PATH;
       headerArray[3] = new Header(tARGET_METHO, "/");
       header = new Header(tARGET_METHO, "/index.html");
       headerArray[4] = header;
       tARGET_METHO = Header.TARGET_SCHEME;
       headerArray[5] = new Header(tARGET_METHO, "http");
       header = new Header(tARGET_METHO, "https");
       headerArray[6] = header;
       tARGET_METHO = Header.RESPONSE_STATUS;
       headerArray[7] = new Header(tARGET_METHO, "200");
       headerArray[8] = new Header(tARGET_METHO, "204");
       headerArray[9] = new Header(tARGET_METHO, "206");
       headerArray[10] = new Header(tARGET_METHO, "304");
       headerArray[11] = new Header(tARGET_METHO, "400");
       headerArray[12] = new Header(tARGET_METHO, "404");
       header = new Header(tARGET_METHO, "500");
       headerArray[13] = header;
       headerArray[14] = new Header("accept-charset", "");
       headerArray[15] = new Header("accept-encoding", "gzip, deflate");
       headerArray[16] = new Header("accept-language", "");
       headerArray[17] = new Header("accept-ranges", "");
       headerArray[18] = new Header("accept", "");
       headerArray[19] = new Header("access-control-allow-origin", "");
       headerArray[20] = new Header("age", "");
       headerArray[21] = new Header("allow", "");
       headerArray[22] = new Header("authorization", "");
       headerArray[23] = new Header("cache-control", "");
       headerArray[24] = new Header("content-disposition", "");
       headerArray[25] = new Header("content-encoding", "");
       headerArray[26] = new Header("content-language", "");
       headerArray[27] = new Header("content-length", "");
       headerArray[28] = new Header("content-location", "");
       headerArray[29] = new Header("content-range", "");
       headerArray[30] = new Header("content-type", "");
       headerArray[31] = new Header("cookie", "");
       headerArray[32] = new Header("date", "");
       headerArray[33] = new Header("etag", "");
       headerArray[34] = new Header("expect", "");
       headerArray[35] = new Header("expires", "");
       headerArray[36] = new Header("from", "");
       headerArray[37] = new Header("host", "");
       headerArray[38] = new Header("if-match", "");
       headerArray[39] = new Header("if-modified-since", "");
       headerArray[40] = new Header("if-none-match", "");
       headerArray[41] = new Header("if-range", "");
       headerArray[42] = new Header("if-unmodified-since", "");
       headerArray[43] = new Header("last-modified", "");
       headerArray[44] = new Header("link", "");
       headerArray[45] = new Header("location", "");
       headerArray[46] = new Header("max-forwards", "");
       headerArray[47] = new Header("proxy-authenticate", "");
       headerArray[48] = new Header("proxy-authorization", "");
       headerArray[49] = new Header("range", "");
       headerArray[50] = new Header("referer", "");
       headerArray[51] = new Header("refresh", "");
       headerArray[52] = new Header("retry-after", "");
       headerArray[53] = new Header("server", "");
       headerArray[54] = new Header("set-cookie", "");
       headerArray[55] = new Header("strict-transport-security", "");
       headerArray[56] = new Header("transfer-encoding", "");
       headerArray[57] = new Header("user-agent", "");
       headerArray[58] = new Header("vary", "");
       headerArray[59] = new Header("via", "");
       headerArray[60] = new Header("www-authenticate", "");
       Hpack.STATIC_HEADER_TABLE = headerArray;
       Hpack.NAME_TO_FIRST_INDEX = Hpack.nameToFirstIndex();
    }
    public void Hpack(){
       super();
    }
    public static ByteString checkLowercase(ByteString p0){
       int i = p0.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return p0;
          }
          byte bytex = p0.getByte(i1);
          if (bytex < 65 || bytex > 90) {
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: "+p0.utf8());
    }
    public static Map nameToFirstIndex(){
       LinkedHashMap linkedHashMa = new LinkedHashMap(Hpack.STATIC_HEADER_TABLE.length);
       int i = 0;
       Header[] sTATIC_HEADE = Hpack.STATIC_HEADER_TABLE;
       while (i < sTATIC_HEADE.length) {
          if (!linkedHashMa.containsKey(sTATIC_HEADE[i].name)) {
             linkedHashMa.put(sTATIC_HEADE[i].name, Integer.valueOf(i));
          }
          i = i + 1;
       }
       return Collections.unmodifiableMap(linkedHashMa);
    }
}
