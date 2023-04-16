package com.yxcorp.gifshow.photoad.download.j;
import w07.l;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;

public final class j implements l	// class@000f88
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final void apply(Object p0){
       p0 = p0.z();
       if (p0 != null) {
          p0 = p0.findViewById(R.id.title);
          if (p0 != null) {
             p0.setMaxLines(1);
             p0.setEllipsize(TextUtils$TruncateAt.MIDDLE);
          }
       }
       return;
    }
}
