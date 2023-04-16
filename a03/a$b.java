package a03.a$b;
import a03.a$c;
import java.lang.Object;
import a03.a$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.StringBuilder;
import a03.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import vz2.i;
import qkd.b;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import com.kuaishou.live.effect.resource.download.common.a;

public class a$b implements a$c	// class@000007
{

    public void a$b(){
       super();
    }
    public void a$b(a$a p0){
       super();
    }
    public void a(int p0,long p1,String p2){
       String str1;
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), p2, this, a$b.class, "3")) {
          return;
       }
       StringBuilder str = p1+"->";
       switch (p0){
           case 1:
             str1 = "入队";
             break;
           case 2:
             str1 = "出队";
             break;
           case 3:
             str1 = "合法检查";
             break;
           case 4:
             str1 = "资源检查";
             break;
           case 5:
             str1 = "渲染";
             break;
           case 6:
             str1 = "存活兜底";
             break;
           default:
             str1 = "?";
       }
       a.b(str+str1+"["+p2+"]");
       return;
    }
    public void b(String p0,MagicEmoji$MagicFace p1,int p2){
       String str1;
       SimpleMagicFace mName;
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a$b.class, "1")) {
          return;
       }
       StringBuilder str = "";
       switch (p2){
           case 0:
             str1 = "未知";
             break;
           case 1:
             str1 = "冷启动";
             break;
           case 2:
             str1 = "主播开播预览页";
             break;
           case 3:
             str1 = "进入直播间";
             break;
           case 4:
             str1 = "礼物上新";
             break;
           case 5:
             str1 = "CDN重试";
             break;
           case 6:
             str1 = "网络变化";
             break;
           case 9:
             str1 = "入队兜底";
             break;
           case 10:
             str1 = "出队兜底";
             break;
           default:
          label_0024 :
             str1 = "?";
       }
       str = str+str1+"->["+p0+"]: ";
       p0 = (p1 == null)? "NullMagicFace": p1.mName;
       a.b(str+p0);
       return;
    }
    public void c(String p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, str)) {
          return;
       }
       StringBuilder str1 = p0+"\n";
       p0 = PatchProxy.apply(null, null, a.class, str);
       if (p0 != PatchProxyResult.class) {
       }else {
          File[] uFileArray = new File[]{i.e.a()};
          uFileArray = "剩余磁盘空间:"+b.i0(SystemUtil.u())+"\n礼物素材占用空间:"+b.i0(b.p0(uFileArray))+"\n当前是否低磁盘模式:"+e.b().he().m().a();
       }
       a.b(str1+p0);
       return;
    }
}
