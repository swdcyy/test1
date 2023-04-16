package kshark.lite.LibraryLeak;
import kshark.lite.Leak;
import kshark.lite.LibraryLeak$a;
import nsd.u;
import java.util.List;
import kshark.lite.ReferencePattern;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import std.o;
import java.lang.StringBuilder;

public final class LibraryLeak extends Leak	// class@001bb1
{
    public final String description;
    public final LeakTrace leakTrace;
    public final List leakTraces;
    public final ReferencePattern pattern;
    public final Integer retainedHeapByteSize;
    public static final LibraryLeak$a Companion;
    public static final long serialVersionUID;

    static {
       LibraryLeak.Companion = new LibraryLeak$a(null);
    }
    public void LibraryLeak(List p0,ReferencePattern p1,String p2){
       a.p(p0, "leakTraces");
       a.p(p1, "pattern");
       a.p(p2, "description");
       super(null);
       this.leakTraces = p0;
       this.pattern = p1;
       this.description = p2;
    }
    public static LibraryLeak copy$default(LibraryLeak p0,List p1,ReferencePattern p2,String p3,int p4,Object p5){
       LibraryLeak pattern;
       LibraryLeak description;
       if (p4 & 0x01) {
          p1 = p0.getLeakTraces();
       }
       if (p4 & 0x02) {
          pattern = p0.pattern;
       }
       if (p4 & 0x04) {
          description = p0.description;
       }
       return p0.copy(p1, pattern, description);
    }
    public final List component1(){
       return this.getLeakTraces();
    }
    public final ReferencePattern component2(){
       return this.pattern;
    }
    public final String component3(){
       return this.description;
    }
    public final LibraryLeak copy(List p0,ReferencePattern p1,String p2){
       a.p(p0, "leakTraces");
       a.p(p1, "pattern");
       a.p(p2, "description");
       return new LibraryLeak(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LibraryLeak && (a.g(this.getLeakTraces(), p0.getLeakTraces()) && (a.g(this.pattern, p0.pattern) && a.g(this.description, p0.description))))) {
          return true;
       }
       return false;
    }
    public final String getDescription(){
       return this.description;
    }
    public List getLeakTraces(){
       return this.leakTraces;
    }
    public final ReferencePattern getPattern(){
       return this.pattern;
    }
    public String getShortDescription(){
       return this.pattern.toString();
    }
    public String getSignature(){
       return o.a(this.pattern.toString());
    }
    public int hashCode(){
       List leakTraces = this.getLeakTraces();
       int i = 0;
       int i1 = (leakTraces != null)? leakTraces.hashCode(): 0;
       i1 = i1 * 31;
       LibraryLeak tpattern = this.pattern;
       int i2 = (tpattern != null)? tpattern.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpattern = this.description;
       if (tpattern != null) {
          i = tpattern.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "Leak pattern: "+this.pattern+"\nDescription: "+this.description+10+super.toString()+10;
    }
}
