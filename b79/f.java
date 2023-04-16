package b79.f;
import r79.c;
import java.lang.Object;
import w69.d0;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import r79.c$a;

public final class f implements c	// class@000383
{
    public String b;
    public d0 c;
    public boolean d;
    public long e;
    public boolean f;

    public void f(){
       super();
       this.b = "";
    }
    public final d0 a(){
       return this.c;
    }
    public final String b(){
       return this.b;
    }
    public final boolean c(){
       return this.d;
    }
    public boolean contentEquals(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "another");
       boolean b = (this.d != null && (p0 instanceof f && p0.d != null))? true: false;
       return b;
    }
    public final void d(boolean p0){
       this.d = p0;
    }
    public long getClipDuration(){
       return this.e;
    }
    public DataType getDataType(){
       return DataType.CUSTOM;
    }
    public long getDuration(){
       return 0;
    }
    public int getHeight(){
       return 0;
    }
    public String getPath(){
       return "";
    }
    public int getPosition(){
       return 0;
    }
    public float getRatio(){
       return 0;
    }
    public long getSize(){
       return 0;
    }
    public String getTypeLoggerStr(){
       return "";
    }
    public int getWidth(){
       return 0;
    }
    public boolean isSelected(){
       return this.f;
    }
    public boolean isVideoType(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c$a.a(this);
    }
    public boolean objectEquals(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "another");
       return p0 instanceof f;
    }
    public void setClipDuration(long p0){
       this.e = p0;
    }
    public void setSelected(boolean p0){
       this.f = p0;
    }
}
