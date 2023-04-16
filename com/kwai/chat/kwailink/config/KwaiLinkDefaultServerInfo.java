package com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import android.os.Parcelable;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo$a;
import java.lang.Object;
import java.util.ArrayList;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.utils.Utils;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import d85.g;
import java.lang.StringBuilder;
import java.lang.Integer;

public class KwaiLinkDefaultServerInfo implements Parcelable	// class@000a3e
{
    public final List b;
    public final List c;
    public int[] d;
    public int e;
    public static final Parcelable$Creator CREATOR;

    static {
       KwaiLinkDefaultServerInfo.CREATOR = new KwaiLinkDefaultServerInfo$a();
    }
    public void KwaiLinkDefaultServerInfo(){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.e = 1;
    }
    public void KwaiLinkDefaultServerInfo(Parcel p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       ArrayList uArrayList1 = new ArrayList();
       this.c = uArrayList1;
       this.e = 1;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiLinkDefaultServerInfo.class, "7")) {
       }else if(!Utils.dataSizeValid(p0, 0x2800)){
          Utils.readStringList(p0, uArrayList, 10, 1024);
          Utils.readStringList(p0, uArrayList1, 10, 1024);
          this.e = p0.readInt();
          this.d = Utils.readIntArray(p0, 10);
       }
       return;
    }
    public KwaiLinkDefaultServerInfo a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiLinkDefaultServerInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.c.add(p0);
       }
       return this;
    }
    public KwaiLinkDefaultServerInfo b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiLinkDefaultServerInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.b.add(p0);
       }
       return this;
    }
    public List c(){
       ArrayList obj = PatchProxy.apply(null, this, KwaiLinkDefaultServerInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          obj.add(new g(iterator.next(), 0, this.e, 4));
       }
       return obj;
    }
    public List d(){
       ArrayList obj = PatchProxy.apply(null, this, KwaiLinkDefaultServerInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!this.b.isEmpty()) {
          for (int i = 0; i < this.b.size(); i = i + 1) {
             obj.add(new g(this.b.get(i), 0, this.e, 5));
          }
       }
       return obj;
    }
    public int describeContents(){
       return 0;
    }
    public KwaiLinkDefaultServerInfo e(int[] p0){
       this.d = p0;
       return this;
    }
    public String toString(){
       Iterator iterator;
       StringBuilder obj = PatchProxy.apply(null, this, KwaiLinkDefaultServerInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "{";
       String str = (this.e == 1)? "tcp": "quic";
       obj = obj+str;
       if (this.c != null) {
          obj = obj+" domainList:[";
          iterator = this.c.iterator();
          while (iterator.hasNext()) {
             obj = obj+iterator.next()+",";
          }
          obj = obj+"]";
       }
       if (this.b != null) {
          obj = obj+" iplist:[";
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             obj = obj+iterator.next()+",";
          }
          obj = obj+"]";
       }
       if (this.d != null) {
          obj = obj+" ports:[";
          KwaiLinkDefaultServerInfo td = this.d;
          int len = td.length;
          for (int i = 0; i < len; i = i + 1) {
             obj = obj+td[i]+",";
          }
          obj = obj+"]";
       }
       return obj+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(KwaiLinkDefaultServerInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KwaiLinkDefaultServerInfo.class, "6")) {
          return;
       }
       Utils.writeStringList(p0, this.b, 10, 1024);
       Utils.writeStringList(p0, this.c, 10, 1024);
       p0.writeInt(this.e);
       Utils.writeIntArray(p0, this.d, 10);
       return;
    }
}
