package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData$a;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData$b;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$a;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import java.lang.Enum;
import lnc.e7;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcel;
import java.lang.Integer;
import java.util.Iterator;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import android.os.Parcelable;

public final class NewRelayStickerDrawerData extends NewStickerElementData	// class@000a7d
{
    public final ArrayList Q;
    public BaseDrawerData$CustomButtonMode R;
    public String S;
    public long T;
    public final ArrayList U;
    public int U0;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public static final Parcelable$Creator CREATOR;
    public static final NewRelayStickerDrawerData$a V0;

    static {
       NewRelayStickerDrawerData.V0 = new NewRelayStickerDrawerData$a(null);
       NewRelayStickerDrawerData.CREATOR = new NewRelayStickerDrawerData$b();
    }
    public void NewRelayStickerDrawerData(){
       super(null, 0, null, false, false, false, 0, false, 0, 511, null);
    }
    public void NewRelayStickerDrawerData(NewRelayStickerDrawerData p0){
       a.p(p0, "editRelayStickerDrawerData");
       super(null, 0, null, false, false, false, 0, false, 0, 511, null);
       this.a(p0);
    }
    public void NewRelayStickerDrawerData(String p0,long p1,ArrayList p2,boolean p3,boolean p4,boolean p5,int p6,boolean p7,int p8){
       NewRelayStickerDrawerData newRelayStic = this;
       Object obj = p2;
       a.p(p0, "title");
       a.p(obj, "relatedUserInfoList");
       super(6, 1, 0, 0, 0, 0, 60, null);
       newRelayStic.S = p0;
       newRelayStic.T = p1;
       newRelayStic.U = obj;
       newRelayStic.V = p3;
       newRelayStic.W = p4;
       newRelayStic.X = p5;
       newRelayStic.Y = p6;
       newRelayStic.Z = p7;
       newRelayStic.U0 = p8;
       newRelayStic.Q = new ArrayList();
       BaseDrawerData$CustomButtonMode eDIT_TEXT = (newRelayStic.V != null)? BaseDrawerData$CustomButtonMode.EDIT_TEXT: BaseDrawerData$CustomButtonMode.TIME_PANEL;
       newRelayStic.R = eDIT_TEXT;
       NewRelayStickerDrawer$a eDIT_TEXT1 = NewRelayStickerDrawer.Companion;
       this.N(eDIT_TEXT1.a());
       this.O(eDIT_TEXT1.a());
       e7.c(EditBubbleItem.RELAY_STICKER_BUBBLE.name());
       return;
    }
    public void NewRelayStickerDrawerData(String p0,long p1,ArrayList p2,boolean p3,boolean p4,boolean p5,int p6,boolean p7,int p8,int p9,u p10){
       int i = p9;
       ArrayList uArrayList = null;
       String str = (i & 0x01)? "": uArrayList;
       int i1 = (i & 0x02)? 0: p1;
       if (i & 0x04) {
          uArrayList = new ArrayList();
       }
       int i2 = 0;
       int i3 = (i & 0x08)? 0: p3;
       int i4 = (i & 0x10)? 0: p4;
       int i5 = (i & 0x20)? 1: p5;
       int i6 = (i & 0x40)? 0: p6;
       if (!(i & 0x0080)) {
          i2 = p7;
       }
       i = (i & 0x0100)? 4097: p8;
       super(str, i1, uArrayList, i3, i4, i5, i6, i2, i);
       return;
    }
    public int B0(){
       return this.U0;
    }
    public void M0(int p0){
       this.U0 = p0;
    }
    public void R0(NewDecorationElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawerData.class, "3")) {
          return;
       }
       a.p(p0, "elementData");
       super.R0(p0);
       int i = 0;
       if (p0 instanceof NewRelayStickerDrawerData) {
          Object[] objArray = new Object[i];
          a.D().w("NewRelayStickerDrawerData", "updateData invoked with data = "+p0, objArray);
          this.T = p0.T;
          this.V = p0.V;
          this.W = p0.W;
          this.X = p0.X;
          this.Y = p0.Y;
          this.Z = p0.Z;
          NewRelayStickerDrawer$a companion = NewRelayStickerDrawer.Companion;
          this.N(companion.a());
          this.O(companion.a());
          this.U.clear();
          this.U.addAll(p0.U);
          this.Q.clear();
          this.Q.addAll(p0.Q);
       }else {
          Object[] objArray1 = new Object[i];
          a.D().A("NewRelayStickerDrawerData", "updateData invoked with wrong type data", objArray1);
       }
       return;
    }
    public final int S0(){
       return this.Y;
    }
    public final ArrayList T0(){
       return this.Q;
    }
    public final long U0(){
       return this.T;
    }
    public final ArrayList V0(){
       return this.U;
    }
    public final String W0(){
       return this.S;
    }
    public final boolean Y0(){
       return this.X;
    }
    public final void Z0(boolean p0){
       this.Z = p0;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawerData.class, "2")) {
          return;
       }
       a.p(p0, "editRelayStickerDrawerData");
       super.a(p0);
       if (p0 instanceof NewRelayStickerDrawerData) {
          this.T = p0.T;
          this.V = p0.V;
          this.W = p0.W;
          this.X = p0.X;
          this.Y = p0.Y;
          this.Z = p0.Z;
          this.U.clear();
          this.U.addAll(p0.U);
          this.Q.clear();
          this.Q.addAll(p0.Q);
       }
       return;
    }
    public final void a1(boolean p0){
       this.W = p0;
    }
    public final void b1(int p0){
       this.Y = p0;
    }
    public final void c1(boolean p0){
       this.V = p0;
    }
    public final void d1(long p0){
       this.T = p0;
    }
    public int describeContents(){
       return 0;
    }
    public final void e1(boolean p0){
       this.X = p0;
    }
    public final void f1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawerData.class, "9")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.S = p0;
       return;
    }
    public final void g1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawerData.class, "7")) {
          return;
       }
       a.p(p0, "userInfoList");
       this.Q.clear();
       this.Q.addAll(p0);
       return;
    }
    public final void h1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawerData.class, "4")) {
          return;
       }
       a.p(p0, "newTitle");
       this.S = p0;
       return;
    }
    public BaseDrawerData$CustomButtonMode j(){
       return this.R;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NewRelayStickerDrawerData.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+"##NewRelayStickerDrawerData: title="+this.S+", "+"relatedPostCount="+this.T+", "+"isPictureType="+this.V+", isInEditMode="+this.W+", "+"isRelayTitleEditable="+this.X+", broughtFromFeed="+this.Z+", "+"invitedFriendsCount="+this.Y;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewRelayStickerDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewRelayStickerDrawerData.class, "10")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.S);
       p0.writeLong(this.T);
       NewRelayStickerDrawerData tU = this.U;
       p0.writeInt(tU.size());
       Iterator iterator = tU.iterator();
       while (iterator.hasNext()) {
          p0.writeParcelable(iterator.next(), p1);
       }
       p0.writeInt(this.V);
       p0.writeInt(this.W);
       p0.writeInt(this.X);
       p0.writeInt(this.Y);
       p0.writeInt(this.Z);
       p0.writeInt(this.U0);
       return;
    }
}
