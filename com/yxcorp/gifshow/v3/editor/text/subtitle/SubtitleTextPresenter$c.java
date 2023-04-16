package com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter$c;
import xuc.b;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.List;
import java.util.ArrayList;

public class SubtitleTextPresenter$c implements b	// class@00148d
{
    public final SubtitleTextPresenter a;

    public void SubtitleTextPresenter$c(SubtitleTextPresenter p0){
       this.a = p0;
       super();
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, SubtitleTextPresenter$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.D.f(0);
    }
    public List d(){
       Object obj = PatchProxy.apply(null, this, SubtitleTextPresenter$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
}
