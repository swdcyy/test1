package com.google.protobuf.RopeByteString$Balancer;
import java.lang.Object;
import java.util.ArrayDeque;
import com.google.protobuf.RopeByteString$1;
import com.google.protobuf.ByteString;
import com.google.protobuf.RopeByteString;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import java.util.Arrays;

public class RopeByteString$Balancer	// class@0004a2
{
    public final ArrayDeque prefixesStack;

    public void RopeByteString$Balancer(){
       super();
       this.prefixesStack = new ArrayDeque();
    }
    public void RopeByteString$Balancer(RopeByteString$1 p0){
       super();
    }
    public ByteString balance(ByteString p0,ByteString p1){
       this.doBalance(p0);
       this.doBalance(p1);
       p0 = this.prefixesStack.pop();
       while (!this.prefixesStack.isEmpty()) {
          RopeByteString ropeByteStri = new RopeByteString(this.prefixesStack.pop(), p0, null);
       }
       return p0;
    }
    public final void doBalance(ByteString p0){
       if (p0.isBalanced()) {
          this.insert(p0);
       }else if(p0 instanceof RopeByteString){
          this.doBalance(p0.left);
          this.doBalance(p0.right);
       }else {
          throw new IllegalArgumentException("Has a new type of ByteString been created? Found "+p0.getClass());
       }
       return;
    }
    public final int getDepthBinForLength(int p0){
       p0 = Arrays.binarySearch(RopeByteString.minLengthByDepth, p0);
       if (p0 < 0) {
          p0++;
          p0 = (- p0) - 1;
       }
       return p0;
    }
    public final void insert(ByteString p0){
       int depthBinForL = this.getDepthBinForLength(p0.size());
       int i = RopeByteString.minLength((depthBinForL + 1));
       if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= i) {
          this.prefixesStack.push(p0);
       }else {
          depthBinForL = RopeByteString.minLength(depthBinForL);
          ByteString uByteString = this.prefixesStack.pop();
          while (!this.prefixesStack.isEmpty() && this.prefixesStack.peek().size() < depthBinForL) {
             uByteString = new RopeByteString(this.prefixesStack.pop(), uByteString, null);
          }
          RopeByteString ropeByteStri = new RopeByteString(uByteString, p0, null);
          while (!this.prefixesStack.isEmpty()) {
             int i1 = this.getDepthBinForLength(ropeByteStri.size()) + 1;
             if (this.prefixesStack.peek().size() < RopeByteString.minLength(i1)) {
                ropeByteStri = new RopeByteString(this.prefixesStack.pop(), ropeByteStri, null);
             }else {
                break ;
             }
          }
          this.prefixesStack.push(ropeByteStri);
       }
       return;
    }
}
