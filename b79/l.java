package b79.l;
import r79.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import r79.c$a;

public final class l implements c	// class@000389
{
    public long b;
    public boolean c;

    public void l(){
       super();
    }
    public boolean contentEquals(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "another");
       return true;
    }
    public long getClipDuration(){
       return this.b;
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
       return this.c;
    }
    public boolean isVideoType(){
       Object obj = PatchProxy.apply(null, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c$a.a(this);
    }
    public boolean objectEquals(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "another");
       if (!p0 instanceof l) {
          return false;
       }
       if (this == p0) {
          return true;
       }
       return false;
    }
    public void setClipDuration(long p0){
       this.b = p0;
    }
    public void setSelected(boolean p0){
       this.c = p0;
    }
}
