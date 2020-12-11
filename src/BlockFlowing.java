/*     */ import java.util.Random;
/*     */ 
/*     */ public class BlockFlowing
/*     */   extends BlockFluid {
/*     */   int a;
/*     */   boolean[] b;
/*     */   int[] c;
/*     */   
/*     */   protected BlockFlowing(int paramInt, Material paramhz) {
/*  10 */     super(paramInt, paramhz);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  20 */     this.a = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     this.b = new boolean[4];
/* 107 */     this.c = new int[4]; } private void i(World paramdp, int paramInt1, int paramInt2, int paramInt3) { int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3); paramdp.a(paramInt1, paramInt2, paramInt3, this.blockId + 1, i);
/*     */     paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     paramdp.f(paramInt1, paramInt2, paramInt3); }
/* 110 */   private int a(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { int i = 1000;
/* 111 */     for (int b = 0; b < 4; b++) {
/* 112 */       if ((b != 0 || paramInt5 != 1) && (
/* 113 */         b != 1 || paramInt5 != 0) && (
/* 114 */         b != 2 || paramInt5 != 3) && (
/* 115 */         b != 3 || paramInt5 != 2)) {
/*     */         
/* 117 */         int j = paramInt1;
/* 118 */         int k = paramInt2;
/* 119 */         int m = paramInt3;
/*     */         
/* 121 */         if (b == 0) j--; 
/* 122 */         if (b == 1) j++; 
/* 123 */         if (b == 2) m--; 
/* 124 */         if (b == 3) m++;
/*     */         
/* 126 */         if (!k(paramdp, j, k, m))
/*     */         {
/* 128 */           if (paramdp.getBlockMaterial(j, k, m) != this.blockMaterial || paramdp.getBlockMetadata(j, k, m) != 0) {
/*     */ 
/*     */             
/* 131 */             if (!k(paramdp, j, k - 1, m)) {
/* 132 */               return paramInt4;
/*     */             }
/* 134 */             if (paramInt4 < 4) {
/* 135 */               int n = a(paramdp, j, k, m, paramInt4 + 1, b);
/* 136 */               if (n < i) i = n; 
/*     */             } 
/*     */           }  } 
/*     */       } 
/*     */     } 
/* 141 */     return i; }
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) { int i = g(paramdp, paramInt1, paramInt2, paramInt3); boolean bool = true; if (i > 0) { int j = -100; this.a = 0; j = onBlockAdded(paramdp, paramInt1 - 1, paramInt2, paramInt3, j); j = onBlockAdded(paramdp, paramInt1 + 1, paramInt2, paramInt3, j); j = onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3 - 1, j); j = onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3 + 1, j); int k = j + this.d; if (k >= 8 || j < 0) k = -1;  if (g(paramdp, paramInt1, paramInt2 + 1, paramInt3) >= 0) { int m = g(paramdp, paramInt1, paramInt2 + 1, paramInt3); if (m >= 8) { k = m; } else { k = m + 8; }  }  if (this.a >= 2 && this.blockMaterial == Material.f) if (paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) { k = 0; } else if (paramdp.getBlockMaterial(paramInt1, paramInt2 - 1, paramInt3) == this.blockMaterial && paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) { k = 0; }   if (this.blockMaterial == Material.g && i < 8 && k < 8 && k > i && paramRandom.nextInt(4) != 0) { k = i; bool = false; }  if (k != i) { i = k; if (i < 0) { paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0); } else { paramdp.b(paramInt1, paramInt2, paramInt3, i); paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId); paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId); }  } else if (bool) { i(paramdp, paramInt1, paramInt2, paramInt3); }  } else { i(paramdp, paramInt1, paramInt2, paramInt3); }  if (l(paramdp, paramInt1, paramInt2 - 1, paramInt3)) { if (i >= 8) { paramdp.b(paramInt1, paramInt2 - 1, paramInt3, this.blockId, i); } else { paramdp.b(paramInt1, paramInt2 - 1, paramInt3, this.blockId, i + 8); }  } else if (i >= 0 && (i == 0 || k(paramdp, paramInt1, paramInt2 - 1, paramInt3))) { boolean[] arrayOfBoolean = j(paramdp, paramInt1, paramInt2, paramInt3); int j = i + this.d; if (i >= 8) j = 1;  if (j >= 8)
/*     */         return;  if (arrayOfBoolean[0])
/*     */         f(paramdp, paramInt1 - 1, paramInt2, paramInt3, j);  if (arrayOfBoolean[1])
/*     */         f(paramdp, paramInt1 + 1, paramInt2, paramInt3, j);  if (arrayOfBoolean[2])
/*     */         f(paramdp, paramInt1, paramInt2, paramInt3 - 1, j);  if (arrayOfBoolean[3])
/* 147 */         f(paramdp, paramInt1, paramInt2, paramInt3 + 1, j);  }  } private boolean[] j(World paramdp, int paramInt1, int paramInt2, int paramInt3) { int i; for (i = 0; i < 4; i++) {
/* 148 */       this.c[i] = 1000;
/* 149 */       int j = paramInt1;
/* 150 */       int k = paramInt2;
/* 151 */       int m = paramInt3;
/*     */       
/* 153 */       if (i == 0) j--; 
/* 154 */       if (i == 1) j++; 
/* 155 */       if (i == 2) m--; 
/* 156 */       if (i == 3) m++; 
/* 157 */       if (!k(paramdp, j, k, m))
/*     */       {
/* 159 */         if (paramdp.getBlockMaterial(j, k, m) != this.blockMaterial || paramdp.getBlockMetadata(j, k, m) != 0)
/*     */         {
/*     */           
/* 162 */           if (!k(paramdp, j, k - 1, m)) {
/* 163 */             this.c[i] = 0;
/*     */           } else {
/* 165 */             this.c[i] = a(paramdp, j, k, m, 1, i);
/*     */           } 
/*     */         }
/*     */       }
/*     */     } 
/* 170 */     i = this.c[0]; byte b;
/* 171 */     for (b = 1; b < 4; b++) {
/* 172 */       if (this.c[b] < i) i = this.c[b];
/*     */     
/*     */     } 
/*     */     
/* 176 */     for (b = 0; b < 4; b++) {
/* 177 */       this.b[b] = (this.c[b] == i);
/*     */     }
/* 179 */     return this.b; }
/*     */   private void f(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { if (l(paramdp, paramInt1, paramInt2, paramInt3)) { int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3); if (i > 0)
/*     */         if (this.blockMaterial == Material.g) { h(paramdp, paramInt1, paramInt2, paramInt3); } else { Block.blocksList[i].a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3)); }
/*     */           paramdp.b(paramInt1, paramInt2, paramInt3, this.blockId, paramInt4); }
/* 183 */      } private boolean k(World paramdp, int paramInt1, int paramInt2, int paramInt3) { int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/* 184 */     if (i == Block.aE.blockId || i == Block.aL.blockId || i == Block.aD.blockId || i == Block.aF.blockId) {
/* 185 */       return true;
/*     */     }
/* 187 */     if (i == 0) return false; 
/* 188 */     Material hz = (Block.blocksList[i]).blockMaterial;
/* 189 */     if (hz.a()) return true; 
/* 190 */     return false; }
/*     */ 
/*     */   
/*     */   protected int onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 194 */     int i = g(paramdp, paramInt1, paramInt2, paramInt3);
/* 195 */     if (i < 0) return paramInt4; 
/* 196 */     if (i == 0) this.a++; 
/* 197 */     if (i >= 8) {
/* 198 */       i = 0;
/*     */     }
/* 200 */     return (paramInt4 < 0 || i < paramInt4) ? i : paramInt4;
/*     */   }
/*     */   
/*     */   private boolean l(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 204 */     Material hz = paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3);
/* 205 */     if (hz == this.blockMaterial) return false;
/* 206 */     if (hz == hz.g) return false; 
/* 207 */     return !k(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 211 */     super.onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3);
/* 212 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) == this.blockId)
/* 213 */       paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\inventory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */