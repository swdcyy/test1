package com.frog.engine.utils.StringEscapeUtils$Builder;
import com.frog.engine.utils.CharSequenceTranslator;
import java.lang.Object;
import java.lang.StringBuilder;
import com.frog.engine.utils.StringEscapeUtils$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;

public final class StringEscapeUtils$Builder	// class@001577
{
    public final StringBuilder sb;
    public final CharSequenceTranslator translator;

    public void StringEscapeUtils$Builder(CharSequenceTranslator p0){
       super();
       this.sb = "";
       this.translator = p0;
    }
    public void StringEscapeUtils$Builder(CharSequenceTranslator p0,StringEscapeUtils$a p1){
       super(p0);
    }
    public StringEscapeUtils$Builder append(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StringEscapeUtils$Builder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.sb+p0;
       return this;
    }
    public StringEscapeUtils$Builder escape(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StringEscapeUtils$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.sb+this.translator.translate(p0);
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StringEscapeUtils$Builder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.sb;
    }
}
