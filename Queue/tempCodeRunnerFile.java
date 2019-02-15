StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d,capacity = %d\n",size,data.length));
        res.append('[');
        for(int i = 0;i < size;i++) {
            res.append(data[i]);
            if(i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();