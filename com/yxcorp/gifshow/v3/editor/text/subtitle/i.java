package com.yxcorp.gifshow.v3.editor.text.subtitle.i;
import erd.r;
import java.lang.Object;
import njd.a;
import evc.b;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleHelper$AudioRecognizeException;
import java.lang.String;

public final class i implements r	// class@00149c
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final boolean test(Object p0){
       int i = p0.a().a();
       boolean b = true;
       if (i == b) {
       }else if(i == 20){
          b = false;
       }else {
          throw new SubtitleHelper$AudioRecognizeException("Ê¶±ð³ö´í");
       }
       return b;
    }
}
