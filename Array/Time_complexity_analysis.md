# ***时间复杂度分析***
### 假设capacity=n，执行n+1次addLast，触发resize，总共进行2n+1次基本操作
---
## ***均摊复杂度(amortized time complexity)***
### 平均每次addLast操作，进行大约2次[(2n+1)/(n+1)]基本操作，则addLast均摊复杂度是O(1)
### 同理removeLast操作，均摊复杂度也为O(1)
---
## ***复杂度震荡***
### 若capacity=n，反复执行addLast => removeLast，这样每次都会触发resize，每一次都会耗费O(n)时间复杂度
### ***原因***：removeLast时resize过于着急(Eager)
### ***解决方案***：Lazy
### 当size == capacity / 4时，才将capacity减半