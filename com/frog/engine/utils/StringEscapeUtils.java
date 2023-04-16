package com.frog.engine.utils.StringEscapeUtils;
import java.util.HashMap;
import java.lang.Object;
import com.frog.engine.utils.AggregateTranslator;
import com.frog.engine.utils.CharSequenceTranslator;
import com.frog.engine.utils.LookupTranslator;
import java.util.Map;
import java.util.Collections;
import com.frog.engine.utils.EntityArrays;
import com.frog.engine.utils.StringEscapeUtils$Builder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.frog.engine.utils.StringEscapeUtils$a;
import java.lang.CharSequence;

public class StringEscapeUtils	// class@001579
{
    public static final CharSequenceTranslator ESCAPE_JSON;

    static {
       HashMap hashMap = new HashMap();
       hashMap.put("\"", "\\\"");
       hashMap.put("\\", "\\\\");
       hashMap.put("/", "\\/");
       CharSequenceTranslator[] uCharSequenc = new CharSequenceTranslator[]{new LookupTranslator(Collections.unmodifiableMap(hashMap)),new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE)};
       StringEscapeUtils.ESCAPE_JSON = new AggregateTranslator(uCharSequenc);
    }
    public void StringEscapeUtils(){
       super();
    }
    public static StringEscapeUtils$Builder builder(CharSequenceTranslator p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringEscapeUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StringEscapeUtils$Builder(p0, null);
    }
    public static final String escapeJson(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringEscapeUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StringEscapeUtils.ESCAPE_JSON.translate(p0);
    }
}
