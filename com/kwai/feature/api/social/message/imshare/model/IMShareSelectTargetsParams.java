package com.kwai.feature.api.social.message.imshare.model.IMShareSelectTargetsParams;
import java.io.Serializable;
import com.kwai.feature.api.social.message.imshare.model.KwaiImageBindable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import cw5.d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class IMShareSelectTargetsParams implements Serializable	// class@00115a
{
    public String comment;
    public String hint;
    public final KwaiImageBindable imageBindable;
    public final List selections;
    public final int shareAction;
    public d title;
    public static final long serialVersionUID = 0x1826dfd6ea0ca51a;

    public void IMShareSelectTargetsParams(KwaiImageBindable p0,int p1){
       super();
       this.selections = Collections.synchronizedList(new ArrayList());
       this.imageBindable = p0;
       this.shareAction = p1;
    }
    public void IMShareSelectTargetsParams(Collection p0,d p1,String p2,String p3,KwaiImageBindable p4,int p5){
       super();
       this.selections = Collections.synchronizedList(new ArrayList());
       this.title = p1;
       this.comment = p2;
       this.hint = p3;
       this.imageBindable = p4;
       this.shareAction = p5;
       this.setSelections(p0);
    }
    public void setSelections(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMShareSelectTargetsParams.class, "1")) {
          return;
       }
       this.selections.clear();
       this.selections.addAll(p0);
       return;
    }
}
