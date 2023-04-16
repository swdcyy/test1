package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$d;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import e17.i;

public final class MoodTemplateViewBinder$d implements Observer	// class@000b5c
{
    public static final MoodTemplateViewBinder$d b;

    static {
       MoodTemplateViewBinder$d.b = new MoodTemplateViewBinder$d();
    }
    public void MoodTemplateViewBinder$d(){
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("MoodTemplateViewBinder", "mMessageToast it:"+p0, objArray);
          i.d(R.style.arg_RES_7f110668, p0);
       }
       return;
    }
}
