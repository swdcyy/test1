package com.kuaishou.post.story.entrance.data.MoodTemplateData;
import android.os.Parcelable;
import com.kuaishou.post.story.entrance.data.MoodTemplateData$a;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.io.Serializable;
import java.lang.Enum;

public class MoodTemplateData implements Parcelable	// class@000b35
{
    public String b;
    public String c;
    public List d;
    public List e;
    public String f;
    public String g;
    public int h;
    public int i;
    public double j;
    public double k;
    public String l;
    public String m;
    public PostTaskManager$PostTaskState n;
    public String o;
    public String p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public static final Parcelable$Creator CREATOR;

    static {
       MoodTemplateData.CREATOR = new MoodTemplateData$a();
    }
    public void MoodTemplateData(){
       super(null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, 0, 0, 0, 0, false, 0xfffff, null);
    }
    public void MoodTemplateData(String p0,String p1,List p2,List p3,String p4,String p5,int p6,int p7,double p8,double p9,String p10,String p11,PostTaskManager$PostTaskState p12,String p13,String p14,int p15,int p16,int p17,int p18,boolean p19){
       int i = this;
       Object obj = p3;
       Object obj1 = p4;
       Object obj2 = p5;
       Object obj3 = p10;
       Object obj4 = p11;
       Object obj5 = p12;
       Object obj6 = p14;
       a.p(p0, "templateId");
       a.p(p1, "templateName");
       a.p(p2, "templateResourceUrlList");
       a.p(obj, "templateIconUrlList");
       a.p(obj1, "templateResourcePath");
       a.p(obj2, "templateFolderPath");
       a.p(obj3, "stickerColor");
       a.p(obj4, "extra");
       a.p(obj5, "taskState");
       a.p(obj6, "previewTextColor");
       super();
       i.b = p0;
       i.c = p1;
       i.d = p2;
       i.e = obj;
       i.f = obj1;
       i.g = obj2;
       i.h = p6;
       i.i = p7;
       i.j = p8;
       i.k = p9;
       i.l = obj3;
       i.m = obj4;
       i.n = obj5;
       i.o = p13;
       i.p = obj6;
       i.q = p15;
       i.r = p16;
       i.s = p17;
       i.t = p18;
       i.u = p19;
    }
    public void MoodTemplateData(String p0,String p1,List p2,List p3,String p4,String p5,int p6,int p7,double p8,double p9,String p10,String p11,PostTaskManager$PostTaskState p12,String p13,String p14,int p15,int p16,int p17,int p18,boolean p19,int p20,u p21){
       int i = p20;
       String str = "";
       String str1 = (i & 0x01)? str: p0;
       String str2 = (i & 0x02)? str: p1;
       ArrayList uArrayList = (i & 0x04)? new ArrayList(): p2;
       ArrayList uArrayList1 = (i & 0x08)? new ArrayList(): p3;
       String str3 = (i & 0x10)? str: p4;
       String str4 = (i & 0x20)? str: 0;
       int i1 = -1;
       int i2 = (i & 0x40)? -1: p6;
       if (!(i & 0x0080)) {
          i1 = p7;
       }
       int i3 = 0x3fe0000000000000;
       int i4 = (i & 0x0100)? i3: p8;
       if (!(i & 0x0200)) {
          i3 = p9;
       }
       String str5 = "#80FFFFFF";
       String str6 = (i & 0x0400)? str5: p10;
       if (!(i & 0x0800)) {
          str = p11;
       }
       PostTaskManager$PostTaskState iDLE = (i & 0x1000)? PostTaskManager$PostTaskState.IDLE: 0;
       PostTaskManager$PostTaskState postTaskStat = iDLE;
       int i5 = (i & 0x2000)? 0: p13;
       int i6 = i5;
       if (!(i & 0x4000)) {
          str5 = p14;
       }
       int i7 = 0;
       i5 = (0x8000 & i)? 0: p15;
       int i8 = (i & 0x10000)? 1: p16;
       int i9 = (i & 0x20000)? 0x7f081dc9: p17;
       int i10 = (i & 0x40000)? 0: p18;
       if (!(i & 0x80000)) {
          i7 = p19;
       }
       super(str1, str2, uArrayList, uArrayList1, str3, str4, i2, i1, i4, i3, str6, str, postTaskStat, i6, str5, i5, i8, i9, i10, i7);
       return;
    }
    public final void A(double p0){
       this.k = p0;
    }
    public final void B(int p0){
       this.t = p0;
    }
    public final void C(PostTaskManager$PostTaskState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateData.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.n = p0;
       return;
    }
    public final void D(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateData.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public final void E(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateData.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
    public final int a(){
       return this.q;
    }
    public final String b(){
       return this.m;
    }
    public final int c(){
       return this.r;
    }
    public final String d(){
       return this.p;
    }
    public int describeContents(){
       return 0;
    }
    public final String e(){
       return this.l;
    }
    public final int f(){
       return this.i;
    }
    public final double g(){
       return this.j;
    }
    public final double h(){
       return this.k;
    }
    public final int i(){
       return this.t;
    }
    public final PostTaskManager$PostTaskState j(){
       return this.n;
    }
    public final String k(){
       return this.g;
    }
    public final int l(){
       return this.s;
    }
    public final List m(){
       return this.e;
    }
    public final String n(){
       return this.b;
    }
    public final String o(){
       return this.c;
    }
    public final String q(){
       return this.f;
    }
    public final List t(){
       return this.d;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MoodTemplateData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MoodTemplateData\(templateId=\'"+this.b+"\', templateName=\'"+this.c+"\', "+"templateResourceUrlList="+this.d+", "+"templateIconUrlList="+this.e+", templateResourcePath=\'"+this.f+"\', "+"templateFolderPath=\'"+this.g+"\', type="+this.h+", stickerId="+this.i+", "+"stickerPercentX="+this.j+", stickerPercentY="+this.k+", "+"stickerColor=\'"+this.l+"\', extra=\'"+this.m+"\', taskState="+this.n+", isDisposed="+this.u+" ,"+"md5="+this.o+", previewTextColor=\'"+this.p+"\', "+"defaultInputTextColorIndex="+this.q+", "+"previewLayoutType="+this.r+", templateIconResId:"+this.s+')';
    }
    public final int w(){
       return this.h;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(MoodTemplateData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, MoodTemplateData.class, "12")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.b);
       p0.writeString(this.c);
       MoodTemplateData td = this.d;
       p0.writeInt(td.size());
       Iterator iterator = td.iterator();
       while (iterator.hasNext()) {
          p0.writeSerializable(iterator.next());
       }
       td = this.e;
       p0.writeInt(td.size());
       iterator = td.iterator();
       while (iterator.hasNext()) {
          p0.writeSerializable(iterator.next());
       }
       p0.writeString(this.f);
       p0.writeString(this.g);
       p0.writeInt(this.h);
       p0.writeInt(this.i);
       p0.writeDouble(this.j);
       p0.writeDouble(this.k);
       p0.writeString(this.l);
       p0.writeString(this.m);
       p0.writeString(this.n.name());
       p0.writeString(this.o);
       p0.writeString(this.p);
       p0.writeInt(this.q);
       p0.writeInt(this.r);
       p0.writeInt(this.s);
       p0.writeInt(this.t);
       p0.writeInt(this.u);
       return;
    }
    public final boolean x(){
       return this.u;
    }
    public final void y(boolean p0){
       this.u = p0;
    }
    public final void z(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateData.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.l = p0;
       return;
    }
}
