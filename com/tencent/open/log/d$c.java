package com.tencent.open.log.d$c;
import java.lang.Object;
import java.io.File;
import android.os.StatFs;
import java.lang.String;
import java.lang.Long;

public class d$c	// class@000f66
{
    public File a;
    public long b;
    public long c;

    public void d$c(){
       super();
    }
    public static d$c b(File p0){
       d$c uoc = new d$c();
       uoc.a(p0);
       StatFs statFs = new StatFs(p0.getAbsolutePath());
       long l = (long)statFs.getBlockSize();
       uoc.a(((long)statFs.getBlockCount() * l));
       uoc.b(((long)statFs.getAvailableBlocks() * l));
       return uoc;
    }
    public File a(){
       return this.a;
    }
    public void a(long p0){
       this.b = p0;
    }
    public void a(File p0){
       this.a = p0;
    }
    public long b(){
       return this.b;
    }
    public void b(long p0){
       this.c = p0;
    }
    public long c(){
       return this.c;
    }
    public String toString(){
       Object[] objArray = new Object[]{this.a().getAbsolutePath(),Long.valueOf(this.c()),Long.valueOf(this.b())};
       return String.format("[%s : %d / %d]", objArray);
    }
}
