package com.kwai.video.clipkit.utils.Lyrics$Singer;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;

public final class Lyrics$Singer extends Enum	// class@001af9
{
    public static final Lyrics$Singer[] $VALUES;
    public static final Lyrics$Singer COMBINE;
    public static final Lyrics$Singer FEMALE;
    public static final Lyrics$Singer MALE;

    static {
       Lyrics$Singer singer = new Lyrics$Singer("MALE", 0);
       Lyrics$Singer.MALE = singer;
       Lyrics$Singer singer1 = new Lyrics$Singer("FEMALE", 1);
       Lyrics$Singer.FEMALE = singer1;
       Lyrics$Singer singer2 = new Lyrics$Singer("COMBINE", 2);
       Lyrics$Singer.COMBINE = singer2;
       Lyrics$Singer[] singerArray = new Lyrics$Singer[]{singer,singer1,singer2};
       Lyrics$Singer.$VALUES = singerArray;
    }
    public void Lyrics$Singer(String p0,int p1){
       super(p0, p1);
    }
    public static Lyrics$Singer parseSinger(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Lyrics$Singer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 'D':
             if (p0.equals("D")) {
                i = 0;
             }
             break;
           case 'F':
             if (p0.equals("F")) {
                i = 1;
             }
             break;
           case 'M':
             if (p0.equals("M")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return Lyrics$Singer.COMBINE;
           case 1:
             return Lyrics$Singer.FEMALE;
           case 2:
             return Lyrics$Singer.MALE;
           default:
             return null;
       }
    }
    public static Lyrics$Singer valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Lyrics$Singer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Lyrics$Singer.class, p0);
    }
    public static Lyrics$Singer[] values(){
       Object obj = PatchProxy.apply(null, null, Lyrics$Singer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Lyrics$Singer.$VALUES.clone();
    }
}
