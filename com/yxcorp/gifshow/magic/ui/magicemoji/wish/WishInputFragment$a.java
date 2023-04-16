package com.yxcorp.gifshow.magic.ui.magicemoji.wish.WishInputFragment$a;
import com.yxcorp.gifshow.magic.ui.widget.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.wish.WishInputFragment;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.CharSequence;
import android.widget.EditText;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.WishMagicInfo;
import java.util.List;
import com.yxcorp.gifshow.model.WishMagicInfo$WishMagicDetailInfo;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import r5b.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class WishInputFragment$a extends a	// class@001c43
{
    public final WishInputFragment g;

    public void WishInputFragment$a(WishInputFragment p0,Context p1){
       this.g = p0;
       super(p1);
    }
    public int J0(){
       return 0x7f0d0ee6;
    }
    public void K0(String p0,int p1){
       WishInputFragment$a uoa = WishInputFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.g.a1.setText(p0);
       if (!TextUtils.x(p0)) {
          this.g.a1.setSelection(p0.length());
       }
       uoa = this.g;
       WishMagicInfo$WishMagicDetailInfo wishMagicDet = uoa.d1.mWishMagicDetailInfos.get(uoa.g1);
       this.g.mi(wishMagicDet, p0);
       wishMagicDet.mIsManual = false;
       WishInputFragment c1 = this.g.c1;
       if (c1 != null) {
          SimpleMagicFace mId = c1.mId;
          p1 = p1 + 1;
          WishMagicInfo$WishMagicDetailInfo mContent = wishMagicDet.mContent;
          wishMagicDet = wishMagicDet.mTitle;
          if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidFourRefs(mId, Integer.valueOf(p1), mContent, wishMagicDet, null, e.class, "15")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MAGIC_FACE_WORD_DEFAULT";
             uElementPack.type = 1;
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("magic_face_id", TextUtils.k(mId));
             jsonObject.a0("index", Integer.valueOf(p1));
             jsonObject.c0("content", TextUtils.k(mContent));
             jsonObject.c0("word_title", TextUtils.k(wishMagicDet));
             uElementPack.params = jsonObject.toString();
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
}
