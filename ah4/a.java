package ah4.a;
import nh4.a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse$HeadInfo;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import java.util.ArrayList;
import androidx.lifecycle.MutableLiveData;
import ub7.e;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse$HeadImageInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse$HeadPhotoNabInfo;
import java.lang.Boolean;
import kx7.c;
import kx7.b;
import kx7.a;
import java.lang.Number;
import java.lang.Integer;
import ok.k;
import java.lang.Long;
import java.lang.StringBuilder;

public class a extends a	// class@0000df
{
    public DetailResponse$HeadInfo d;
    public SkuInfo e;
    public String f;
    public List g;
    public int h;
    public int i;
    public int j;
    public MutableLiveData k;
    public List l;
    public e m;

    public void a(DetailResponse$HeadInfo p0,SkuInfo p1,int p2){
       super();
       this.g = new ArrayList();
       this.k = new MutableLiveData();
       this.l = new ArrayList();
       this.a = 10;
       this.b = p2;
       this.f = p0.mVideoUrl;
       this.d = p0;
       this.j(p1);
    }
    public e a(){
       return this.m;
    }
    public int b(){
       a th = this.h;
       if (th == null) {
          return this.i;
       }
       return (this.i % th);
    }
    public String c(DetailResponse$HeadImageInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !q.f(p0.mImageUrls)) {
          Iterator iterator = p0.mImageUrls.iterator();
          while (iterator.hasNext()) {
             CDNUrl uCDNUrl = iterator.next();
             if (!TextUtils.isEmpty(uCDNUrl.getUrl())) {
                return uCDNUrl.getUrl();
             }
          }
       }
       return "";
    }
    public int d(int p0){
       if (p0 <= 0) {
          return 0;
       }
       return (p0 % this.h);
    }
    public List e(){
       List list;
       a td = this.d;
       if (td != null) {
          DetailResponse$HeadInfo mHeadPhotoNa = td.mHeadPhotoNabInfo;
          if (mHeadPhotoNa != null) {
             list = mHeadPhotoNa.mHeadPhotoNavInfos;
          label_000d :
             return list;
          }
       }
       list = null;
       goto label_000d ;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (this.getClass() == p0.getClass() && (this.h == p0.h && (this.i == p0.i && (this.j == p0.j && ((this.f).equals(p0.f) && this.g.equals(p0.g))))))) {
          b = true;
       }
    label_004a :
       return b;
    }
    public List f(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.l)) {
          return this.l;
       }
       obj = new ArrayList(this.g);
       if (this.h() && this.j < this.l.size()) {
          obj.remove(this.j);
       }
       if (q.f(obj)) {
          return this.l;
       }else {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             c uoc = new c();
             uoc.d(1);
             b uob = new b();
             uob.b(this.c(iterator.next()));
             uoc.c(uob);
             this.l.add(uoc);
          }
          return this.l;
       }
    }
    public int g(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       int i = 0;
       if (obj != null) {
          DetailResponse$HeadInfo mImageUrlsV2 = obj.mImageUrlsV2;
          if (mImageUrlsV2 != null && mImageUrlsV2.size()) {
             Iterator iterator = this.d.mImageUrlsV2.iterator();
             while (iterator.hasNext()) {
                if (iterator.next().mType == 1) {
                   i = i + 1;
                }
             }
          }
       }
       return i;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.f) ^ 0x01);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.f,this.g,Integer.valueOf(this.h),Integer.valueOf(this.i),Integer.valueOf(this.j)};
       return k.b(obj);
    }
    public boolean i(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = ((p0 % this.h) == this.j && this.h())? true: false;
       return b;
    }
    public boolean j(SkuInfo p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = false;
       if (obj == p0 && obj != null) {
          return b;
       }
       this.g.clear();
       if (p0 != null && !q.f(p0.mImageUrls)) {
          DetailResponse$HeadImageInfo headImageInf = new DetailResponse$HeadImageInfo();
          headImageInf.mImageUrls = p0.mImageUrls;
          long l = (q.f(p0.mPropValueIds))? 0: p0.mPropValueIds.get(b).longValue();
          headImageInf.mPropId = l;
          this.g.add(headImageInf);
          this.j = 1;
       }else {
          this.j = b;
       }
       if (!q.f(this.d.mImageUrlsV2)) {
          this.g.addAll(this.d.mImageUrlsV2);
          this.h = this.g.size();
          this.k.setValue((this.b() + 1)+"/"+this.h);
       }
       this.e = p0;
       return 1;
    }
}
