package com.kuaishou.live.common.core.component.notification.LiveCommonNotificationMessage;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.kuaishou.live.common.core.component.notification.LiveCommonNotificationMessage$LiveCommonNotificationExtraInfo;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBroadcastNotice;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Number;
import android.graphics.Color;

public class LiveCommonNotificationMessage implements Comparable	// class@0016df
{
    public LiveCommonNoticeMessages$SCTopBroadcastNotice A;
    public LiveCommonNotificationMessage$LiveCommonNotificationExtraInfo B;
    public String C;
    public int D;
    public String E;
    public int F;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public CharSequence k;
    public int l;
    public Bitmap m;
    public int n;
    public boolean o;
    public List p;
    public long q;
    public int r;
    public int s;
    public long t;
    public long u;
    public UserInfo v;
    public UserInfo w;
    public String x;
    public int y;
    public boolean z;

    public void LiveCommonNotificationMessage(){
       super();
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.l = 0x7f0812bf;
       this.n = -1;
    }
    public LiveCommonNotificationMessage A(int p0){
       this.y = p0;
       return this;
    }
    public LiveCommonNotificationMessage C(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonNotificationMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c = this.z(p0);
       return this;
    }
    public int a(){
       return this.y;
    }
    public int b(){
       return this.c;
    }
    public int c(){
       return this.f;
    }
    public int compareTo(Object p0){
       int i1;
       int i = 1;
       if (this.z != null) {
          i1 = p0.z ^ i;
       }else if(this.r > p0.r){
          i = -1;
       }
       i1 = i;
       return i1;
    }
    public int d(){
       return this.b;
    }
    public long e(){
       return this.t;
    }
    public String f(){
       return this.C;
    }
    public LiveCommonNotificationMessage f0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonNotificationMessage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e = this.z(p0);
       return this;
    }
    public int g(){
       return this.l;
    }
    public LiveCommonNotificationMessage g0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonNotificationMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d = this.z(p0);
       return this;
    }
    public Bitmap h(){
       return this.m;
    }
    public LiveCommonNotificationMessage h0(String p0){
       this.b = this.z(p0);
       return this;
    }
    public int i(){
       return this.i;
    }
    public LiveCommonNotificationMessage i0(long p0){
       this.t = p0;
       return this;
    }
    public int j(){
       return this.h;
    }
    public LiveCommonNotificationMessage j0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonNotificationMessage.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.C = p0;
       if (!TextUtils.isEmpty(p0)) {
          try{
             LiveCommonNotificationMessage$LiveCommonNotificationExtraInfo liveCommonNo = a.a.h(p0, LiveCommonNotificationMessage$LiveCommonNotificationExtraInfo.class);
             this.B = liveCommonNo;
             this.D = liveCommonNo.mRevenueCrmId;
          }catch(com.google.gson.JsonSyntaxException e0){
             b.Z(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "extraInfoJsonStr parse error");
          }
       }
    }
    public int k(){
       return this.g;
    }
    public LiveCommonNotificationMessage k0(int p0){
       this.l = p0;
       return this;
    }
    public int l(){
       if (this.z != null) {
          return this.A.bizType;
       }
       return this.s;
    }
    public LiveCommonNotificationMessage l0(int p0){
       this.s = p0;
       return this;
    }
    public int m(){
       return this.n;
    }
    public String n(){
       return this.E;
    }
    public LiveCommonNotificationMessage n0(long p0){
       this.u = p0;
       return this;
    }
    public int o(){
       return this.F;
    }
    public LiveCommonNotificationMessage o0(int p0){
       this.r = p0;
       return this;
    }
    public String p(){
       return this.x;
    }
    public LiveCommonNotificationMessage p0(int p0){
       this.n = p0;
       return this;
    }
    public LiveCommonNotificationMessage q0(String p0){
       this.E = p0;
       return this;
    }
    public UserInfo r(){
       return this.w;
    }
    public LiveCommonNotificationMessage r0(String p0){
       this.x = p0;
       return this;
    }
    public String s(){
       return this.j;
    }
    public LiveCommonNotificationMessage s0(UserInfo p0){
       this.w = p0;
       return this;
    }
    public LiveCommonNotificationMessage t0(String p0){
       this.j = p0;
       return this;
    }
    public CharSequence u(){
       return this.k;
    }
    public LiveCommonNotificationMessage u0(CharSequence p0){
       this.k = p0;
       return this;
    }
    public UserInfo v(){
       return this.v;
    }
    public LiveCommonNotificationMessage v0(UserInfo p0){
       this.v = p0;
       return this;
    }
    public boolean x(){
       boolean b = (this.D != null)? true: false;
       return b;
    }
    public boolean y(){
       return this.z;
    }
    public final int z(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonNotificationMessage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return -1;
       }
       try{
          return Color.parseColor(p0);
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
}
