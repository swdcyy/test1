package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.f;
import android.view.View$OnClickListener;
import y8c.r;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import o5b.g;
import nl8.p;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.ToDeleteMagicFace;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$c;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import v4b.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.widget.TextView;
import java.lang.CharSequence;

public class f extends r implements View$OnClickListener	// class@001bde
{
    public final MagicFaceAdapter i;

    public void f(MagicFaceAdapter p0){
       super();
       this.i = p0;
       this.o(new g(p0));
    }
    public final void H(View p0,boolean p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, f.class, "3")) {
          return;
       }
       p0.setSelected(p1);
       p0 = p0.findViewById(R.id.magic_emoji_cover_selected_bg);
       int i = (p1)? 0: 4;
       n.Y(p0, i, false);
       return;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       MagicEmoji$MagicFace magicFace = this.t();
       if (p0 != null && magicFace instanceof ToDeleteMagicFace) {
          MagicEmoji$MagicFace magicFace1 = magicFace;
          int i = magicFace1.mIsSelected ^ 1;
          magicFace1.mIsSelected = i;
          this.H(p0, i);
          int i1 = this.F();
          MagicFaceAdapter$c uoc = this.i.x1();
          if (uoc instanceof DeleteTopTitlePresenter$a) {
             uoc.ca(magicFace.mId, i1, magicFace.mIsSelected);
          }
          ToDeleteMagicFace mIsSelected = magicFace1.mIsSelected;
          SimpleMagicFace mId = magicFace.mId;
          c uoc1 = c.class;
          if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(mIsSelected), mId, null, uoc1, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "DELETE_MY_MAGIC_FACE";
             i3 oi3 = i3.f();
             oi3.a("is_delete", Boolean.valueOf(mIsSelected));
             oi3.d("magic_face_id", mId);
             uElementPack.params = oi3.e();
             u1.u(1, uElementPack, null);
          }
       }
    label_007c :
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       MagicEmoji$MagicFace magicFace = this.t();
       if (!magicFace instanceof ToDeleteMagicFace) {
          return;
       }
       TextView textView = this.q(R.id.magic_emoji_name_tv);
       if (textView != null) {
          textView.setText(magicFace.mName);
       }
       n.Y(this.q(R.id.undownload_flag), 4, false);
       this.H(this.y(), magicFace.mIsSelected);
       this.y().setOnClickListener(this);
       return;
    }
}
