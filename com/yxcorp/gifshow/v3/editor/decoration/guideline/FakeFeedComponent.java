package com.yxcorp.gifshow.v3.editor.decoration.guideline.FakeFeedComponent;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.editor.decoration.guideline.FakeFeedComponent$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.text.TextPaint;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class FakeFeedComponent extends RelativeLayout	// class@000f0f
{
    public final String b;
    public final int c;
    public TextView d;
    public KwaiImageView e;
    public TextView f;
    public HashMap g;
    public static final FakeFeedComponent$a h;

    static {
       FakeFeedComponent.h = new FakeFeedComponent$a(null);
    }
    public void FakeFeedComponent(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = "@";
       this.c = a1.d(0x7f070310);
       this.a();
    }
    public void FakeFeedComponent(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = "@";
       this.c = a1.d(0x7f070310);
       this.a();
    }
    public void FakeFeedComponent(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = "@";
       this.c = a1.d(0x7f070310);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, FakeFeedComponent.class, "1")) {
          return;
       }
       a.d(this.getContext(), R.layout.arg_RES_7f0d0788, this, true);
       View view = this.findViewById(R.id.fake_component_user_name);
       a.o(view, "findViewById\(R.id.fake_component_user_name\)");
       this.d = view;
       if (view == null) {
          a.S("mUserName");
       }
       TextPaint paint = view.getPaint();
       a.o(paint, "mUserName.paint");
       paint.setFakeBoldText(true);
       view = this.findViewById(R.id.fake_component_user_profile);
       a.o(view, "findViewById\(R.id.fake_component_user_profile\)");
       this.e = view;
       view = this.findViewById(R.id.fake_component_user_name_music);
       a.o(view, "findViewById\(R.id.fake_component_user_name_music\)");
       this.f = view;
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, FakeFeedComponent.class, "2")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       FakeFeedComponent td = this.d;
       if (td == null) {
          a.S("mUserName");
       }
       a.o(mE, "user");
       td.setText(this.b+mE.getName());
       td = this.f;
       if (td == null) {
          a.S("mUserMusicContent");
       }
       td.setText(mE.getName()+a1.p(R.string.arg_RES_7f101add));
       td = this.e;
       if (td == null) {
          a.S("mUserProfile");
       }
       td.V(mE.getAvatars(), this.c, this.c);
       return;
    }
}
