package com.yxcorp.gifshow.activity.share.presenter.m0$a;
import tyc.u4;
import com.yxcorp.gifshow.activity.share.presenter.m0;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public class m0$a extends u4	// class@0013ff
{
    public final m0 b;

    public void m0$a(m0 p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().s("ShareEditorTopicHintPresenter", "afterTextChanged: "+p0.toString(), objArray);
       this.b.P8(p0.toString());
       return;
    }
}
