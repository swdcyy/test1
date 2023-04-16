package com.kuaishou.live.core.show.comments.f$a;
import ne1.h;
import com.kuaishou.live.core.show.comments.f;
import java.lang.Object;
import java.util.Collection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.component.comments.display.e;
import s93.v;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import va1.a0;
import n52.l;
import z1.a;
import lf1.q;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import com.kwai.feature.api.live.base.model.LiveCommentsFoldMessageConfig;
import n52.k;
import java.util.Objects;
import com.kuaishou.live.common.core.component.follow.FollowAnchorMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveShareMessage;
import com.kuaishou.live.common.core.component.like.LikeMessage;
import lp3.e;
import lp3.c;
import lp3.b;
import java.util.List;
import n52.m;
import com.kuaishou.live.core.show.comments.LiveCommentsAreaConfig;
import re1.h;
import java.util.Collections;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import da1.a;
import ne1.g;
import com.kuaishou.android.live.model.QLivePlayConfig;
import w51.a;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.android.live.model.QLivePlayConfig$NoticeContent;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import java.lang.StringBuilder;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCForbidComment;
import com.google.protobuf.nano.MessageNano;

public class f$a implements h	// class@000a5f
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void Cb(int p0,Collection p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       this.b.I.e(p0, p1);
       return;
    }
    public void Db(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "20")) {
          return;
       }
       this.b.Z.a(p0);
       return;
    }
    public void E3(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "13")) {
          return;
       }
       this.b.I.E3();
       return;
    }
    public boolean Ho(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.E;
    }
    public void Ik(QLiveMessage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "7")) {
          return;
       }
       if (this.b.A != null && a0.c(p0.getUser())) {
          this.b.A.m1(p0, p1, new l(this, p0));
       }else {
          this.b.S8(p0);
       }
       return;
    }
    public void L7(boolean p0){
       this.b.M = p0;
    }
    public void M3(LiveCommentsDisplayParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "19")) {
          return;
       }
       this.b.I.M3(p0);
       return;
    }
    public void N1(LiveCommentsFoldMessageConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "17")) {
          return;
       }
       f$a tb = this.b;
       boolean b = (p0 != null)? true: false;
       tb.J = b;
       tb.I.N1(p0);
       return;
    }
    public void Qm(){
       this.b.F = true;
    }
    public void R0(QLiveMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "5")) {
          return;
       }
       if (this.b.A != null && a0.c(p0.getUser())) {
          this.b.A.m1(p0, null, new k(this, p0));
       }else {
          this.b.S8(p0);
       }
       return;
    }
    public boolean Tn(QLiveMessage p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f$a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0x23a797:
             if (p1.equals("LIKE")) {
                i = 0;
             }
             break;
           case 0x4b357bf:
             if (p1.equals("SHARE")) {
                i = 1;
             }
             break;
           case 0x74c2ab03:
             if (p1.equals("FOLLOW_ANCHOR")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return p0 instanceof LikeMessage;
           case 1:
             return p0 instanceof LiveShareMessage;
           case 2:
             return p0 instanceof FollowAnchorMessage;
           default:
             return false;
       }
    }
    public void Wl(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "14")) {
          return;
       }
       this.b.I.clear();
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void dd(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "8")) {
          return;
       }
       f a = this.b.A;
       if (a != null) {
          a.k5(p0, new m(this, p0));
       }
       return;
    }
    public void destroy(){
       b.b(this);
    }
    public void h6(LiveCommentsAreaConfig p0){
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "18")) {
          return;
       }
       f o = this.b.O;
       LiveCommentsAreaConfig mMaxShowComm = p0.mMaxShowCommentLimit;
       Objects.requireNonNull(o);
       if (mMaxShowComm > null) {
          o.a = mMaxShowComm;
       }
       o = this.b.O;
       mMaxShowComm = p0.mUserMatchedFeatures;
       Objects.requireNonNull(o);
       if (!PatchProxy.applyVoidOneRefs(mMaxShowComm, o, h.class, "1")) {
          if (mMaxShowComm == null) {
             list = Collections.emptyList();
          }
          o.b = list;
       }
       this.b.I.g(p0.mUserMatchedFeatures);
       return;
    }
    public int h8(boolean p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uoa = this.b;
       f h = uoa.H;
       if (p0) {
          uoa.H = 0;
       }
       return h;
    }
    public long ki(){
       return this.b.W;
    }
    public void li(int p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "15")) {
          return;
       }
       uoa = this.b;
       Objects.requireNonNull(uoa);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, uof, "21")) {
          b.c0(LiveLogTag.COMMENT, "addSupportFeedType", "type", Integer.valueOf(p0));
          uoa.C.a(p0);
       }
       return;
    }
    public void lo(g p0){
       this.b.D = p0;
    }
    public void m2(boolean p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "11")) {
          return;
       }
       this.b.I.m2(p0);
       return;
    }
    public int pl(boolean p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uoa = this.b;
       f g = uoa.G;
       if (p0) {
          uoa.G = 0;
       }
       return g;
    }
    public void s2(int p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b.I.s2(p0);
       return;
    }
    public boolean ug(QLiveMessage p0,boolean p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return a0.h(p0, p1);
    }
    public void vf(QLivePlayConfig p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, f.class, "20")) {
          b.Z(LiveLogTag.COMMENT, "initLiveCommentsDisplayController -- showSystemNotice");
          if (!a.C()) {
             ArrayList uArrayList = PatchProxy.applyOneRefs(p0, null, LiveCommentsMocker.class, "7");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                uArrayList = new ArrayList();
                Iterator iterator = p0.mNoticeList.iterator();
                b = true;
                int i = 0;
                while (iterator.hasNext()) {
                   SystemNoticeMessage systemNotice = LiveCommentsMocker.e(iterator.next(), p0.mNoticeDisplayDuration, b);
                   int i1 = i + 1;
                   systemNotice.mId = systemNotice.mId+i;
                   uArrayList.add(systemNotice);
                   LiveCommentsMocker.a(systemNotice);
                   systemNotice = 0;
                }
             }
             tb.G = tb.G + uArrayList.size();
             tb.I.h(uArrayList);
             tb.I.w4();
          }
       }
       return;
    }
    public void w4(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "12")) {
          return;
       }
       this.b.I.w4();
       return;
    }
    public void yg(int p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "16")) {
          return;
       }
       uoa = this.b;
       Objects.requireNonNull(uoa);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, uof, "22")) {
          b.c0(LiveLogTag.COMMENT, "removeSupportFeedType", "type", Integer.valueOf(p0));
          uoa.C.e(p0);
       }
       return;
    }
    public void zc(LiveStreamMessages$SCForbidComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "3")) {
          return;
       }
       f$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, f.class, "16")) {
          b.Z(LiveLogTag.COMMENT, "setForbidComment:"+p0.toString());
          tb.Y8(p0, false);
       }
       return;
    }
}
