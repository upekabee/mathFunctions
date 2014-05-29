package mathFunctions;

import java.util.*;

class Solution {
  public static void main(String[] args) {
    
    boolean[] results = sieve(20);
    System.out.println("Results: ");
    for (int i=0; i<results.length; i++) {
      if (results[i]) {
          System.out.println(i);
      }
      
    }
    
  }
  
  // Sieve of Eratosthenes 
  static boolean[] sieve(int k) {
    
    boolean[] primes = new boolean[k+1];
    Arrays.fill(primes, true);
    
    primes[0] = false; 
    primes[1] = false; 
    double m = Math.sqrt(k);
    
    for (int i=2; i<=m; i++) {
      if (primes[i]) {
          for (int j=i*i; j<=k; j+=i) {
            primes[j] = false;
          }
      }     
    }
    
    return primes;
  }
  
  static int gcd(int a, int b) {
    if (b==0) return a;
    return gcd(b, a%b);
  }
  
  static int lcm(int a, int b) {
    return (a*b)/gcd(a,b);
  }
}