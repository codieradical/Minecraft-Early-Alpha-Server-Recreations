/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet22Collect
/*    */   extends Packet {
/*    */   public int a;
/*    */   public int b;
/*    */
/*    */
/*    */   public Packet22Collect(int paramInt1, int paramInt2) {
/* 12 */     this.a = paramInt1;
/* 13 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 17 */     this.a = paramDataInputStream.readInt();
/* 18 */     this.b = paramDataInputStream.readInt();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 22 */     paramDataOutputStream.writeInt(this.a);
/* 23 */     paramDataOutputStream.writeInt(this.b);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 27 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 31 */     return 8;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */