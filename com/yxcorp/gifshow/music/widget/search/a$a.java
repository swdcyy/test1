package com.yxcorp.gifshow.music.widget.search.a$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.music.widget.search.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import lnc.a1;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import oqb.a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.text.SpannableString;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import im8.f;

public class a$a extends PresenterV2	// class@0020af
{
    public String p;
    public f q;
    public View r;
    public TextView s;
    public final a t;

    public void a$a(a p0){
       this.t = p0;
       super();
    }
    public void E8(){
       a$a ts;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "3")) {
          return;
       }
       a a = this.t.A;
       if (a != null && MusicSearchUiOption.Companion.a(a.getMainColorId())) {
          this.r.setBackgroundColor(a1.a(this.t.A.getMainColorId()));
       }else {
          ts = this.r;
          if (this.t.w == null) {
             objArray = this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f08022c);
          }
          ts.setBackground(objArray);
       }
       this.r.setOnClickListener(new a(this));
       ts = this.s;
       Resources resources = this.getContext().getResources();
       int i = (this.t.w != null)? 0x7f061fda: 0x7f061f7d;
       ts.setTextColor(resources.getColor(i));
       this.s.setText(TextUtils.C(this.l8().getColor(R.color.arg_RES_7f061fe8), this.p, this.t.x));
       a = this.t.A;
       if (a != null && (this.s != null && MusicSearchUiOption.Companion.b(a.getSugKeywordLeftMargin()))) {
          ViewGroup$LayoutParams layoutParams = this.s.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             layoutParams.leftMargin = this.t.A.getSugKeywordLeftMargin();
             this.s.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a14c8);
       this.s = p0.findViewById(0x7f0a15e8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.p = this.q8(String.class);
       this.q = this.x8("ADAPTER_POSITION");
       return;
    }
}
