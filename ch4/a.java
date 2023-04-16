package ch4.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@000565
{
    public final String mDividerColor;
    public final float mDividerHeight;
    public final float mMarginBottom;
    public final float mMarginLeft;
    public final float mMarginRight;
    public final float mMarginTop;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (!Float.compare(this.mDividerHeight, p0.mDividerHeight) && (a.g(this.mDividerColor, p0.mDividerColor) && (!Float.compare(this.mMarginLeft, p0.mMarginLeft) && (!Float.compare(this.mMarginRight, p0.mMarginRight) && (!Float.compare(this.mMarginTop, p0.mMarginTop) && !Float.compare(this.mMarginBottom, p0.mMarginBottom)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = Float.floatToIntBits(this.mDividerHeight) * 31;
       a tmDividerCol = this.mDividerColor;
       int i1 = (tmDividerCol != null)? tmDividerCol.hashCode(): 0;
       return (((((((((i + i1) * 31) + Float.floatToIntBits(this.mMarginLeft)) * 31) + Float.floatToIntBits(this.mMarginRight)) * 31) + Float.floatToIntBits(this.mMarginTop)) * 31) + Float.floatToIntBits(this.mMarginBottom));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DetailDividerInfo\(mDividerHeight="+this.mDividerHeight+", mDividerColor="+this.mDividerColor+", mMarginLeft="+this.mMarginLeft+", mMarginRight="+this.mMarginRight+", mMarginTop="+this.mMarginTop+", mMarginBottom="+this.mMarginBottom+"\)";
    }
}
