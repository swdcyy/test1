package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$a;
import com.yxcorp.gifshow.util.audiorecord.a$b;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder;
import java.lang.Object;
import java.io.File;
import java.util.List;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$b;

public class FragmentAudioRecorder$a implements a$b	// class@001f40
{
    public int a;
    public final FragmentAudioRecorder b;

    public void FragmentAudioRecorder$a(FragmentAudioRecorder p0){
       this.b = p0;
       super();
       this.a = 0;
    }
    public File a(){
       FragmentAudioRecorder$a ta = this.a;
       if (ta < null || ta >= this.b.c.size()) {
          return null;
       }
       FragmentAudioRecorder$a ta1 = this.a;
       this.a = ta1 + 1;
       return this.b.c.get(ta1).a;
    }
    public void reset(){
       this.a = 0;
    }
}
