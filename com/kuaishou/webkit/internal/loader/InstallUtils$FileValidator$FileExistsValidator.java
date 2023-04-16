package com.kuaishou.webkit.internal.loader.InstallUtils$FileValidator$FileExistsValidator;
import com.kuaishou.webkit.internal.loader.InstallUtils$FileValidator;
import java.lang.Object;
import java.lang.String;
import java.io.File;

public class InstallUtils$FileValidator$FileExistsValidator implements InstallUtils$FileValidator	// class@00133c
{

    public void InstallUtils$FileValidator$FileExistsValidator(){
       super();
    }
    public boolean validated(String p0,File p1){
       return p1.exists();
    }
}
