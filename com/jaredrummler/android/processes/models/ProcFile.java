package com.jaredrummler.android.processes.models.ProcFile;
import android.os.Parcelable;
import java.io.File;
import com.jaredrummler.android.processes.models.ProcFile$a;
import android.os.Parcel;
import java.lang.String;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ProcFile extends File implements Parcelable	// class@0006e1
{
    public final String content;
    public static final Parcelable$Creator CREATOR;

    static {
       ProcFile.CREATOR = new ProcFile$a();
    }
    public void ProcFile(Parcel p0){
       super(p0.readString());
       this.content = p0.readString();
    }
    public void ProcFile(String p0){
       super(p0);
       this.content = ProcFile.readFile(p0);
    }
    public static String readFile(String p0){
       StringBuilder str = "";
       BufferedReader uBufferedRea = new BufferedReader(new FileReader(p0));
       String str1 = "";
       for (p0 = uBufferedRea.readLine(); p0 != null; p0 = uBufferedRea.readLine()) {
          str = str+str1+p0;
       }
       p0 = str;
       try{
          uBufferedRea.close();
          return p0;
       }catch(java.io.IOException e0){
       }
    }
    public int describeContents(){
       return 0;
    }
    public long length(){
       return (long)(this.content).length();
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.getAbsolutePath());
       p0.writeString(this.content);
    }
}
