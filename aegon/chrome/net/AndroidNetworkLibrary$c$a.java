package aegon.chrome.net.AndroidNetworkLibrary$c$a;
import java.net.SocketImpl;
import java.io.FileDescriptor;
import java.lang.RuntimeException;
import java.lang.String;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.io.InputStream;
import java.lang.Object;
import java.io.OutputStream;

public class AndroidNetworkLibrary$c$a extends SocketImpl	// class@000185
{

    public void AndroidNetworkLibrary$c$a(FileDescriptor p0){
       super();
       this.fd = p0;
    }
    public void accept(SocketImpl p0){
       throw new RuntimeException("accept not implemented");
    }
    public int available(){
       throw new RuntimeException("accept not implemented");
    }
    public void bind(InetAddress p0,int p1){
       throw new RuntimeException("accept not implemented");
    }
    public void close(){
    }
    public void connect(String p0,int p1){
       throw new RuntimeException("connect not implemented");
    }
    public void connect(InetAddress p0,int p1){
       throw new RuntimeException("connect not implemented");
    }
    public void connect(SocketAddress p0,int p1){
       throw new RuntimeException("connect not implemented");
    }
    public void create(boolean p0){
    }
    public InputStream getInputStream(){
       throw new RuntimeException("getInputStream not implemented");
    }
    public Object getOption(int p0){
       throw new RuntimeException("getOption not implemented");
    }
    public OutputStream getOutputStream(){
       throw new RuntimeException("getOutputStream not implemented");
    }
    public void listen(int p0){
       throw new RuntimeException("listen not implemented");
    }
    public void sendUrgentData(int p0){
       throw new RuntimeException("sendUrgentData not implemented");
    }
    public void setOption(int p0,Object p1){
       throw new RuntimeException("setOption not implemented");
    }
}
