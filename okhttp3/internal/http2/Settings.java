package okhttp3.internal.http2.Settings;
import java.lang.Object;
import java.util.Arrays;
import java.lang.Integer;

public final class Settings	// class@001fbc
{
    public int set;
    public final int[] values;

    public void Settings(){
       super();
       int[] ointArray = new int[10];
       this.values = ointArray;
    }
    public void clear(){
       this.set = 0;
       Arrays.fill(this.values, 0);
    }
    public int get(int p0){
       return this.values[p0];
    }
    public boolean getEnablePush(boolean p0){
       int i;
       boolean b = false;
       if (this.set & 0x04) {
          i = this.values[2];
       }else if(p0){
          i = 1;
       }else {
          i = 0;
       }
       if (i == 1) {
          b = true;
       }
       return b;
    }
    public int getHeaderTableSize(){
       int i = (this.set & 0x02)? this.values[1]: -1;
       return i;
    }
    public int getInitialWindowSize(){
       int i = (this.set & 0x0080)? this.values[7]: 0xffff;
       return i;
    }
    public int getMaxConcurrentStreams(int p0){
       if (this.set & 0x10) {
          p0 = this.values[4];
       }
       return p0;
    }
    public int getMaxFrameSize(int p0){
       if (this.set & 0x20) {
          p0 = this.values[5];
       }
       return p0;
    }
    public int getMaxHeaderListSize(int p0){
       if (this.set & 0x40) {
          p0 = this.values[6];
       }
       return p0;
    }
    public boolean isSet(int p0){
       int i = 1;
       if ((i << p0) & this.set) {
       }else {
          i = false;
       }
       return i;
    }
    public void merge(Settings p0){
       int i = 0;
       while (i < 10) {
          if (p0.isSet(i)) {
             this.set(i, p0.get(i));
          }
          i = i + 1;
       }
       return;
    }
    public Settings set(int p0,int p1){
       if (p0 >= 0) {
          Settings tvalues = this.values;
          if (p0 < tvalues.length) {
             this.set = (1 << p0) | this.set;
             tvalues[p0] = p1;
          }
       }
       return this;
    }
    public int size(){
       return Integer.bitCount(this.set);
    }
}
