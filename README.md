Program ini berisi implementasi algoritma Bubble Sort dan Binary Search menggunakan bahasa Java tanpa library

Bubble Sort
Program Bubble Sort digunakan untuk mengurutkan data dengan cara membandingkan elemen yang bersebelahan, lalu menukarnya jika salah urutan.

Pada kode BubbleSort.java, program akan:
1. Melakukan perulangan dari awal hingga akhir array
2. Membandingkan elemen ke-j dengan elemen ke-(j+1)
3. Jika elemen kiri lebih besar, maka kedua elemen ditukar
4. Proses ini diulang sampai seluruh data terurut

Contoh pada kode:
Data awal: 5, 2, 9, 1, 3

Proses:
- 5 dibandingkan dengan 2 → ditukar
- 5 dibandingkan dengan 9 → tidak ditukar  , dan seterusnya
- 
Hasil akhir : 1, 2, 3, 5, 9

Optimasi yang digunakan
Pada kode digunakan variabel swapped:

Jika dalam satu putaran tidak ada pertukaran
Maka program akan berhenti lebih cepat
Ini membuat Bubble Sort lebih efisien pada kondisi data yang sudah hampir terurut.

Binary Search
Program Binary Search digunakan untuk mencari data pada array yang sudah terurut dengan cara membagi dua bagian.

Pada kode BinarySearch.java, program akan:
1. Menentukan batas kiri (left) dan kanan (right)
2. Mengambil nilai tengah (mid)
3. Membandingkan nilai tengah dengan target
4. Jika sama → data ditemukan
5. Jika lebih kecil → pencarian ke kanan
6. Jika lebih besar → pencarian ke kiri
Contoh:
Data: 1, 2, 3, 5, 9
Cari: 5
Hasil: ditemukan di index ke-3

Optimasi yang digunakan
1. Menggunakan perhitungan:
mid = left + (right - left) / 2
untuk menghindari overflow
2. Mengurangi jumlah pencarian dengan membagi data menjadi dua bagian setiap langkah (kompleksitas O(log n))
3. Program langsung berhenti ketika data ditemukan

Jadi, Bubble Sort digunakan untuk mengurutkan data, sedangkan Binary Search digunakan untuk mencari data dengan cepat.
