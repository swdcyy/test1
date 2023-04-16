package b79.j;
import r79.c;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import r79.c$a;

public final class j implements c	// class@000387
{
    public ArrayList b;
    public boolean c;
    public ArrayList d;
    public long e;
    public boolean f;
    public final int g;
    public final int h;

    public void j(int p0,int p1){
       super();
       this.g = p0;
       this.h = p1;
       this.b = new ArrayList();
    }
    public final int a(){
       return this.h;
    }
    public final int b(){
       return this.g;
    }
    public final void c(boolean p0){
       this.c = p0;
    }
    public boolean contentEquals(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "another");
       return true;
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
       Object obj = PatchProxy.apply(null, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c$a.a(this);
    }
    public boolean objectEquals(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "another");
       if (!p0 instanceof j) {
          return false;
       }
       if (this == p0) {
          return true;
       }
       return false;
    }
    public void setClipDuration(long p0){
       this.e = p0;
    }
    public void setSelected(boolean p0){
       this.f = p0;
    }
}
