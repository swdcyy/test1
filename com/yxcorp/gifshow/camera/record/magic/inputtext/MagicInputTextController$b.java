package com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController;
import com.kwai.video.westeros.models.TriggerInputTextConfig;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.model.WishMagicInfo;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.WishMagicInfo$WishMagicDetailInfo;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.kwai.video.westeros.models.TriggerInputTextData;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Collection;
import qrd.l1;
import java.util.Objects;
import t4b.f;
import com.yxcorp.gifshow.magic.ui.magicemoji.wish.WishInputFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import t4b.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.wish.WishInputFragment$b;
import lnc.p3;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import t4b.a;

public final class MagicInputTextController$b implements Runnable	// class@000e38
{
    public final MagicInputTextController b;
    public final TriggerInputTextConfig c;
    public final String d;
    public final int e;

    public void MagicInputTextController$b(MagicInputTextController p0,TriggerInputTextConfig p1,String p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, MagicInputTextController$b.class, str)) {
          return;
       }
       l a = this.b.d.d(l.i).a;
       int i = 0;
       if (a == null) {
          objArray = new Object[i];
          a.D().w("MagicInputTextController", "current magicFace is null", objArray);
          return;
       }else {
          WishMagicInfo wishMagicInf = new WishMagicInfo();
          wishMagicInf.mMagicFaceId = a.mId;
          wishMagicInf.mChildMagicFaceId = a.mChildId;
          WishMagicInfo mWishMagicDe = wishMagicInf.mWishMagicDetailInfos;
          WishMagicInfo$WishMagicDetailInfo wishMagicDet = new WishMagicInfo$WishMagicDetailInfo();
          MagicInputTextController$b tc = this.c;
          if (tc != null) {
             wishMagicDet.mMaxInputLength = tc.getMaxInputLength();
             TriggerInputTextData dataOrDefaul = tc.getDataOrDefault(MagicFaceExtraParams.getLanguage(), objArray);
             if (dataOrDefaul != null) {
                List textList = dataOrDefaul.getTextList();
                a.o(textList, "it.textList");
                wishMagicDet.mCandidateWords.addAll(textList);
                wishMagicDet.mInputHint = dataOrDefaul.getInputHint();
             }
             wishMagicDet.mContent = this.d;
             wishMagicDet.mIndex = this.e;
          }
          mWishMagicDe.add(wishMagicDet);
          MagicInputTextController n = this.b.n;
          Objects.requireNonNull(n);
          if (!PatchProxy.applyVoidTwoRefs(wishMagicInf, a, n, f.class, str)) {
             a.p(wishMagicInf, "wishMagicInfo");
             a.p(a, "magicFace");
             n.c = a;
             if (n.b == null) {
                n.b = new WishInputFragment();
                f b = n.b;
                a.m(b);
                b.setArguments(new BaseEditorFragment$Arguments().setEnableAtFriends(i).setMonitorTextChange(i).setCancelWhileKeyboardHidden(true).setDismissAfterEntryComplete(i).setShowLeftBtn(i).setShowEmojiFirst(i).setEnableEmoji(i).setHintText(objArray).build());
             }
             f b1 = n.b;
             a.m(b1);
             b1.li(a);
             f b2 = n.b;
             a.m(b2);
             b2.oi(wishMagicInf);
             b2 = n.b;
             a.m(b2);
             b2.ni(new g(n));
             objArray = new Object[i];
             p3.D().w("MagicInputTextHandler", "showEditText", objArray);
             b2 = n.b;
             a.m(b2);
             b1 = n.e;
             Objects.requireNonNull(b1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             b2.show(b1.getSupportFragmentManager(), "InputTextFragment");
             n.d.u1();
          }
          return;
       }
    }
}
