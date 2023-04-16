package com.yxcorp.gifshow.activity.share.presenter.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import f66.i;
import jq.a;
import java.lang.String;
import q87.c;
import android.widget.TextView;
import android.text.TextPaint;
import java.util.Objects;
import o07.n;

public final class e implements PopupInterface$f	// class@0013dd
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       boolean b = false;
       View view = a.c(p1, R.layout.arg_RES_7f0d128c, p2, b);
       if (view != null) {
          Object[] objArray = new Object[b];
          a.b().w("PublishRuleTipPresenter", "onCreateView: set fakeBoldText", objArray);
          view.findViewById(R.id.text).getPaint().setFakeBoldText(true);
       }
       Objects.requireNonNull(view);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
