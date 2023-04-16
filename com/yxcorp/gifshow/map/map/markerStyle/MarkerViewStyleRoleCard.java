package com.yxcorp.gifshow.map.map.markerStyle.MarkerViewStyleRoleCard;
import com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle;
import com.yxcorp.gifshow.map.map.markerStyle.MarkerViewStyleRoleCard$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import s0d.e;
import fi5.s;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.components.nearbymodel.model.NearbyMapFeed;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import s0d.f;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import s0d.a;
import android.widget.LinearLayout;
import h6b.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag;
import com.yxcorp.utility.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;

public final class MarkerViewStyleRoleCard extends BaseMarkerViewStyle	// class@001c96
{
    public boolean mHasRelation;
    public final int mMarkerRoleCardImageHeight;
    public final int mMarkerRoleCardImageWidth;
    public static final MarkerViewStyleRoleCard$a Companion;
    public static final long serialVersionUID;

    static {
       MarkerViewStyleRoleCard.Companion = new MarkerViewStyleRoleCard$a(null);
    }
    public void MarkerViewStyleRoleCard(){
       super();
       this.mMarkerRoleCardImageWidth = a1.e(79.00f);
       this.mMarkerRoleCardImageHeight = a1.e(0x42f00000);
    }
    public int cardType(){
       return 5;
    }
    public int coverHeight(){
       return this.mMarkerRoleCardImageHeight;
    }
    public int coverWidth(){
       return this.mMarkerRoleCardImageWidth;
    }
    public View createView(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MarkerViewStyleRoleCard.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = View.inflate(p0, R.layout.arg_RES_7f0d080d, null);
       a.o(view, "View.inflate\(context, R.¡­er_photo_role_card, null\)");
       return view;
    }
    public e imageRequest(QPhoto p0){
       s obj = PatchProxy.applyOneRefs(p0, this, MarkerViewStyleRoleCard.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = s.a;
       int i = 0;
       CommonMeta commonMeta = (p0 != null)? p0.getCommonMeta(): i;
       NearbyMapFeed nearbyMapFee = obj.f(commonMeta);
       if (nearbyMapFee != null) {
          nearbyMapFee = nearbyMapFee.mRoleInfo;
          if (nearbyMapFee != null) {
             NearbyMapFeed$RoleInfo mRole = nearbyMapFee.mRole;
             if (mRole != null) {
                NearbyMapFeed$RoleInfo$Role mImage = mRole.mImage;
                if (mImage != null) {
                   i = f.x().t(mImage).f(ImageRequest$CacheChoice.SMALL).o(this.coverWidth(), this.coverHeight()).v();
                }
             }
          }
       }
       return i;
    }
    public void initView(Context p0,View p1,QPhoto p2){
       s a;
       View[] viewArray1;
       View[] viewArray2;
       View[] viewArray3;
       Object obj1;
       View[] this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MarkerViewStyleRoleCard.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, MarkerViewStyleRoleCard.class, "3") && p1 != null) {
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, MarkerViewStyleRoleCard.class, "6")) {
             this.mHasRelation = false;
             LinearLayout linearLayout = p1.findViewById(R.id.tag_content);
             if (p2 != null) {
                if (linearLayout != null) {
                   List list = a.a.b(p2);
                   ArrayList uArrayList = PatchProxy.applyOneRefs(list, this, MarkerViewStyleRoleCard.class, "7");
                   if (uArrayList != PatchProxyResult.class) {
                   }else {
                      uArrayList = new ArrayList();
                      Iterator list1 = list.iterator();
                      while (list1.hasNext()) {
                         Object obj = list1.next();
                         if (obj.mType == 1 && this.mHasRelation == null) {
                            this.mHasRelation = true;
                            obj1 = 1;
                         }else {
                            obj1 = null;
                         }
                         if (obj1) {
                            uArrayList.add(obj);
                         }
                      }
                   }
                   a.a.g(linearLayout, uArrayList);
                }
             }else {
                this = new View[]{linearLayout};
                n.Z(8, this);
             }
          }
          NearbyMapFeed$RoleInfo$Moment roleInfo$Mom = null;
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, MarkerViewStyleRoleCard.class, "5")) {
             ConstraintLayout uConstraintL = p1.findViewById(R.id.cover_title);
             TextView textView1 = p1.findViewById(R.id.title);
             if (textView1 != null) {
                TextPaint paint = textView1.getPaint();
                if (paint != null) {
                   paint.setFakeBoldText(1);
                }
             }
             a = s.a;
             CommonMeta commonMeta1 = (p2 != null)? p2.getCommonMeta(): roleInfo$Mom;
             NearbyMapFeed nearbyMapFee1 = a.f(commonMeta1);
             if (nearbyMapFee1 != null) {
                nearbyMapFee1 = nearbyMapFee1.mDefaultText;
                if (nearbyMapFee1 != null) {
                label_00c6 :
                   if (!TextUtils.x(nearbyMapFee1) && this.mHasRelation == null) {
                      if (textView1 != null) {
                         textView1.setText(nearbyMapFee1);
                      }
                      viewArray2 = new View[]{textView1};
                      n.Z(0, viewArray2);
                      viewArray3 = new View[]{uConstraintL};
                      n.Z(0, viewArray3);
                   }else {
                      viewArray2 = new View[]{textView1};
                      n.Z(8, viewArray2);
                      viewArray3 = new View[]{uConstraintL};
                      n.Z(8, viewArray3);
                   }
                }
             }
             String str = "";
             goto label_00c6 ;
          }
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, MarkerViewStyleRoleCard.class, "4")) {
             View view = p1.findViewById(R.id.view_bubble);
             View view1 = p1.findViewById(R.id.location_tv);
             a = s.a;
             CommonMeta commonMeta = (p2 != null)? p2.getCommonMeta(): roleInfo$Mom;
             NearbyMapFeed nearbyMapFee = a.f(commonMeta);
             if (nearbyMapFee != null) {
                nearbyMapFee = nearbyMapFee.mRoleInfo;
                if (nearbyMapFee != null) {
                   TextView textView = p1.findViewById(R.id.bubble_title);
                   NearbyMapFeed$RoleInfo mMoment = nearbyMapFee.mMoment;
                   if (mMoment != null) {
                      roleInfo$Mom = mMoment.mMessage;
                   }
                   View[] viewArray = (roleInfo$Mom == null || !roleInfo$Mom.length())? 1: null;
                   if (viewArray) {
                      viewArray1 = new View[]{view,view1};
                      n.Z(8, viewArray1);
                   }else {
                      viewArray = new View[]{view,view1};
                      n.Z(0, viewArray);
                      if (textView != null) {
                         textView.setText(roleInfo$Mom);
                      }
                   }
                }
             }
             viewArray1 = new View[]{view,view1};
             n.Z(8, viewArray1);
          }
       }
    label_015f :
       return;
    }
}
