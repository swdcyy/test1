package kshark.lite.AndroidReferenceMatchers$Companion$libraryLeak$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kshark.lite.b;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import kshark.lite.a;
import java.util.Objects;
import rtd.f;
import java.lang.Class;
import kshark.lite.AndroidBuildMirror$Companion$fromHeapGraph$1;
import java.util.Map;
import msd.a;

public final class AndroidReferenceMatchers$Companion$libraryLeak$1 extends Lambda implements l	// class@001b72
{
    public final l $patternApplies;

    public void AndroidReferenceMatchers$Companion$libraryLeak$1(l p0){
       this.$patternApplies = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(b p0){
       f a;
       a.p(p0, "graph");
       AndroidReferenceMatchers$Companion$libraryLeak$1 t$patternApp = this.$patternApplies;
       Objects.requireNonNull(a.c);
       a.p(p0, "graph");
       f context = p0.getContext();
       String name = a.class.getName();
       a.o(name, "AndroidBuildMirror::class.java.name");
       AndroidBuildMirror$Companion$fromHeapGraph$1 uCompanion$f = new AndroidBuildMirror$Companion$fromHeapGraph$1(p0);
       Objects.requireNonNull(context);
       a.p(name, "key");
       a.p(uCompanion$f, "defaultValue");
       a = context.a;
       Object obj = a.get(name);
       if (obj == null) {
          obj = uCompanion$f.invoke();
          a.put(name, obj);
       }
       return t$patternApp.invoke(obj).booleanValue();
    }
}
