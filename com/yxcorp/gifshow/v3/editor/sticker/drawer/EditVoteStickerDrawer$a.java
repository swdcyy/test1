package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditVoteStickerDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.view.View;
import android.app.Activity;
import e3a.a;
import vtc.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import lnc.u6;
import faa.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import w46.b;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;

public class EditVoteStickerDrawer$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001228
{
    public final DecorationContainerView b;
    public final EditVoteStickerDrawer c;

    public void EditVoteStickerDrawer$a(EditVoteStickerDrawer p0,DecorationContainerView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       float f1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditVoteStickerDrawer$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       float f = EditVoteStickerDrawer.HORIZONTAL_VOTE_STICKER_NORMAL_SIZE / this.c.mBaseDrawerData.i();
       EditVoteStickerDrawer$a tc = this.c;
       if (tc.isVideoType != null) {
          f1 = tc.mBaseDrawerData.t();
       }else {
          Activity uActivity = a.a(this.b);
          EditVoteStickerDrawer$a tb = this.b;
          Object obj = PatchProxy.applyTwoRefs(uActivity, tb, objArray, g.class, "2");
          if (obj != PatchProxyResult.class) {
             f1 = obj.floatValue();
          }else {
             f1 = 0x3f800000;
             if (tb == null || uActivity == null) {
                Object[] objArray1 = new Object[0];
                a.D().A("RecordVoteStickerUtils", "getActivity = "+uActivity+", mRootView = "+tb, objArray1);
             }else {
                try{
                   f1 = g.a(uActivity, new Size(tb.getWidth(), tb.getHeight()), u6.a(uActivity, 0));
                }catch(java.lang.Exception e2){
                   Object[] objArray2 = new Object[0];
                   a.D().t("RecordVoteStickerUtils", "mockGlobalScaleOfVideoType error: "+e2.getMessage(), objArray2);
                }
             }
          }
       }
    }
}
