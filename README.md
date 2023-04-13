# TP2DPBO2023

Saya Rifqi Fajar Indrayadi NIM 2101103 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Desain Program
ERD :
![erd](/Screenshot/erd.png)

## Alur Program
1. tampilan pertama adalah Login/Register. Untuk login, ketika tombol login ditekan maka akan mencari data di tabel akun yang username dan password nya sama dengan masukan user. Ketika user menekan tombol Register maka page Login akan di dispose dan berpindah ke page Register dimana user akan memasukkan username dan password nya lalu data tersebut akan dimasukkan ke database tabel akun dan user akan dikembalikan ke page Login untuk kemudian memasukkan username dan password yang baru dibuat tadi.

![login](/Screenshot/login.png)
![register](/Screenshot/register.png)

2. tampilan main menu akan menampilkan data Driver F1 yang sudah di JOIN dengan tabel akun dan tabel teams. Sehingga data Driver yang tampil adalah data yang dimiliki oleh akun yang sudah Login tadi dan tidak akan tampil di akun lain. Team Name dan Team Principal mengambil dari tabel teams. User juga dapat melihat data Team yang menampilkan data di tabel teams.

![menu](/Screenshot/maindriver.png)
![menu2](/Screenshot/mainteam.png)

3. add team. Disini user dapat memasukkan data team lalu data akan dimasukkan ke dalam database.

![addteam](/Screenshot/addteam.png)

4. add driver. Disini user dapat memasukkan data driver lalu memilih team dari ComboBox dimana team yang dapat dipilih adalah team yang sudah dibuat sebelumnya. lalu user dapat memasukkan foto driver, ketika foto telah dipilih maka akan tampil nama file image yang telah dipilih dan ketika user menekan add maka data akan dimasukkan kedalam database dan foto akan di copy ke folder yang ada di dalam project/lokasi yang sama dengan .JAR.

![adddriver](/Screenshot/adddriver.png)

5. delete data. User dapat menghapus data yang ada dengan menekkan tombol delete. Perlu diketahui bahwa ketika salah satu team dihapus, maka driver yang termasuk ke dalam team tersebut akan dihapus pula

![delete1](/Screenshot/deletedriver.png)
![delete2](/Screenshot/deleteteam.png)

6. update data. User dapat mengubah data yang ada dengan menekkan tombol update. dengan value di text field sudah berisi data yang dipilih. Ketika tidak ada perubahan data namun user tetap menekan update maka data yang sama yang akan di update sehingga tidak ada perubahan pada data.

![update1](/Screenshot/updatedriver.png)
![update2](/Screenshot/updateteam.png)

## Dokumentasi
![program](/Screenshot/program.png)
