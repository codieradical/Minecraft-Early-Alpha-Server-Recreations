/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockWorkbench
/*    */   extends Block
/*    */ {
/*    */   protected BlockWorkbench(int paramInt) {
/*  9 */     super(paramInt, Material.c);
/* 10 */     this.aZ = 59;
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/* 14 */     if (paramInt == 1) return this.aZ - 16; 
/* 15 */     if (paramInt == 0) return Block.x.a(0);
/* 16 */     if (paramInt == 2 || paramInt == 4) return this.aZ + 1; 
/* 17 */     return this.aZ;
/*    */   }
/*    */   
/*    */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/* 21 */     parameq.z();
/* 22 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ds.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */