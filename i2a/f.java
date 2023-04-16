package i2a.f;
import xm5.d;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import android.content.Intent;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;

public class f implements d	// class@00276a
{

    public void f(){
       super();
    }
    public void I50(GifshowActivity p0,int p1,PhotoDetailParam p2,View p3,int p4,int p5,int p6,int p7,boolean p8,int p9,boolean p10,boolean p11){
       Object[] objArray;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       int i = p6;
       f uof = f.class;
       int i1 = 3;
       int i2 = 4;
       int i3 = 12;
       if (PatchProxy.isSupport(uof)) {
          objArray = new Object[i3];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[i1] = oobject2;
          objArray[i2] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          if (PatchProxy.applyVoid(objArray, obj, uof, "2")) {
             return;
          }
       }
       i3 = 14;
       if (PatchProxy.isSupport(uof)) {
          objArray = new Object[i3];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[i1] = oobject2;
          objArray[i2] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          Boolean fALSE = Boolean.FALSE;
          objArray[12] = fALSE;
          objArray[13] = fALSE;
          if (!PatchProxy.applyVoid(objArray, obj, uof, "3")) {
          label_00c7 :
             if (PatchProxy.isSupport(uof)) {
                objArray = new Object[15];
                objArray[0] = oobject;
                objArray[1] = Integer.valueOf(p1);
                objArray[2] = oobject1;
                objArray[i1] = oobject2;
                objArray[i2] = Integer.valueOf(p4);
                objArray[5] = Integer.valueOf(p5);
                objArray[6] = Integer.valueOf(p6);
                objArray[7] = Integer.valueOf(p7);
                objArray[8] = Boolean.valueOf(p8);
                objArray[9] = Integer.valueOf(p9);
                objArray[10] = Boolean.valueOf(p10);
                objArray[11] = Boolean.valueOf(p11);
                Boolean fALSE1 = Boolean.FALSE;
                objArray[12] = fALSE1;
                objArray[13] = fALSE1;
                objArray[14] = Integer.valueOf(1);
                if (!PatchProxy.applyVoid(objArray, obj, uof, "4")) {
                }
             }else if(oobject1 != null){
                oobject1.setBizType(1);
             }
             Intent intent = PhotoDetailActivity.x3(oobject, oobject1, oobject2);
             NormalDetailBizParam normalDetail = new NormalDetailBizParam();
             normalDetail.mEnableLastFrame = p8;
             normalDetail.mStartImageIndex = p9;
             normalDetail.mScrollToComment = p10;
             normalDetail.mAnchorToCommentItemTopWithOffset = false;
             normalDetail.mShowEditor = p11;
             normalDetail.mShrinkTypeIn = i;
             normalDetail.mShrinkTypeOut = p7;
             normalDetail.mDisableAutoReply = false;
             normalDetail.putParamIntoIntent(intent);
             if (i == 2) {
                intent.putExtra("start_enter_page_animation", 0);
                PhotoDetailActivity.K3(oobject, p1, intent, oobject2);
             }else {
                PhotoDetailActivity.J3(p0, p1, intent, p3, p4, p5);
             }
          }
       }else {
          goto label_00c7 ;
       }
       return;
    }
    public void hG(GifshowActivity p0,int p1,PhotoDetailParam p2,View p3,int p4,int p5,int p6,int p7,boolean p8,int p9,boolean p10,boolean p11,boolean p12,boolean p13){
       Object[] objArray;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       int i = p6;
       f uof = f.class;
       int i1 = 14;
       int i2 = 10;
       if (PatchProxy.isSupport(uof)) {
          objArray = new Object[i1];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[i2] = Boolean.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          objArray[12] = Boolean.valueOf(p12);
          objArray[13] = Boolean.valueOf(p13);
          if (PatchProxy.applyVoid(objArray, obj, uof, "3")) {
             return;
          }
       }
       if (PatchProxy.isSupport(uof)) {
          objArray = new Object[15];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[i2] = Boolean.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          Boolean fALSE = Boolean.FALSE;
          objArray[12] = fALSE;
          objArray[13] = fALSE;
          objArray[14] = Integer.valueOf(1);
          if (!PatchProxy.applyVoid(objArray, obj, uof, "4")) {
          label_00e1 :
             if (oobject1 != null) {
                oobject1.setBizType(1);
             }
             Intent intent = PhotoDetailActivity.x3(oobject, oobject1, oobject2);
             NormalDetailBizParam normalDetail = new NormalDetailBizParam();
             normalDetail.mEnableLastFrame = p8;
             normalDetail.mStartImageIndex = p9;
             normalDetail.mScrollToComment = p10;
             normalDetail.mAnchorToCommentItemTopWithOffset = false;
             normalDetail.mShowEditor = p11;
             normalDetail.mShrinkTypeIn = i;
             normalDetail.mShrinkTypeOut = p7;
             normalDetail.mDisableAutoReply = false;
             normalDetail.putParamIntoIntent(intent);
             if (i == 2) {
                intent.putExtra("start_enter_page_animation", 0);
                PhotoDetailActivity.K3(oobject, p1, intent, oobject2);
             }else {
                PhotoDetailActivity.J3(p0, p1, intent, p3, p4, p5);
             }
          }
       }else {
          goto label_00e1 ;
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void od(GifshowActivity p0,int p1,PhotoDetailParam p2,View p3,int p4,int p5,int p6,int p7,boolean p8,int p9,boolean p10,boolean p11,boolean p12,boolean p13,int p14){
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       int i = p6;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[15];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          objArray[12] = Boolean.valueOf(p12);
          objArray[13] = Boolean.valueOf(p13);
          objArray[14] = Integer.valueOf(p14);
          if (PatchProxy.applyVoid(objArray, this, uof, "4")) {
             return;
          }
       }else {
          int i1 = this;
       }
       if (oobject1 != null) {
          p2.setBizType(p14);
       }
       Intent intent = PhotoDetailActivity.x3(p0, p2, p3);
       NormalDetailBizParam normalDetail = new NormalDetailBizParam();
       normalDetail.mEnableLastFrame = p8;
       normalDetail.mStartImageIndex = p9;
       normalDetail.mScrollToComment = p10;
       normalDetail.mAnchorToCommentItemTopWithOffset = p13;
       normalDetail.mShowEditor = p11;
       normalDetail.mShrinkTypeIn = i;
       normalDetail.mShrinkTypeOut = p7;
       normalDetail.mDisableAutoReply = p12;
       normalDetail.putParamIntoIntent(intent);
       if (i == 2) {
          intent.putExtra("start_enter_page_animation", 0);
          PhotoDetailActivity.K3(p0, p1, intent, p3);
       }else {
          PhotoDetailActivity.J3(p0, p1, intent, p3, p4, p5);
       }
       return;
    }
    public void rV(GifshowActivity p0,int p1,PhotoDetailParam p2,View p3,int p4,int p5){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uof, "1")) {
             return;
          }
       }
       if (p2 != null) {
          p2.setBizType(1);
       }
       PhotoDetailActivity.J3(p0, p1, PhotoDetailActivity.x3(p0, p2, p3), p3, p4, p5);
       return;
    }
}
