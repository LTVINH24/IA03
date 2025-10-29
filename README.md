# IA03 - Spring Boot User Management Application

## Giới thiệu

IA03 là một ứng dụng quản lý người dùng được xây dựng bằng Spring Boot. Ứng dụng cung cấp các chức năng đăng ký và xác thực người dùng, sử dụng PostgreSQL làm cơ sở dữ liệu.

## Công nghệ sử dụng

- **Java**: 25
- **Spring Boot**: 3.5.7
- **Spring Data JPA**: Quản lý cơ sở dữ liệu
- **PostgreSQL**: Cơ sở dữ liệu quan hệ
- **Lombok**: Giảm boilerplate code
- **MapStruct**: Object mapping
- **Maven**: Quản lý dependencies và build project
- **Hibernate**: ORM framework
## Tính năng

- ✅ Đăng ký người dùng mới
- ✅ Đăng nhập và xác thực
- ✅ RESTful API endpoints
- ✅ Exception handling toàn cục
- ✅ Validation dữ liệu đầu vào

## Yêu cầu hệ thống

Trước khi chạy ứng dụng, đảm bảo máy tính của bạn đã cài đặt:

- **Java Development Kit (JDK)**: Phiên bản 17 trở lên (khuyến nghị JDK 25)
- **Maven**: Phiên bản 3.6 trở lên (hoặc sử dụng Maven wrapper có sẵn)

## Hướng dẫn cài đặt Java (JDK)


**Cách 1: Cài đặt từ Oracle**

1. Truy cập [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/)
2. Chọn phiên bản JDK (khuyến nghị JDK 25)
3. Tải file installer cho Windows (x64 Installer)
4. Chạy file `.exe` và làm theo hướng dẫn cài đặt
5. Kiểm tra cài đặt:
   ```cmd
   java -version
   javac -version
   ```
## Hướng dẫn cài đặt và chạy trên local

### Bước 1: Mở folder IA03





### Bước 2: Build project

Mở terminal/command prompt trong thư mục project và chạy:
```cmd
./mvnw clean package -DskipTests
```


### Bước 3: Chạy ứng dụng

**Cách 1: Sử dụng Maven**

**Windows:**
```bash
./mvnw spring-boot:run
```
**Cách 2: Chạy file JAR**
```cmd
java -jar target/IA03-0.0.1-SNAPSHOT.jar
```

**Cách 3: Chạy từ IDE**
- Mở project trong IntelliJ IDEA/Eclipse
- Tìm file `Ia03Application.java`
- Click chuột phải và chọn "Run 'Ia03Application'"

### Bước 5: Kiểm tra ứng dụng

Sau khi ứng dụng khởi động thành công, bạn sẽ thấy log:
```
Started Ia03Application in X.XXX seconds
```

Ứng dụng sẽ chạy tại: **http://localhost:8080**

## API Endpoints

### 1. Đăng ký người dùng

**Endpoint:** `POST /user/register`
### 2. Đăng nhập
**Endpoint:** `POST /user/login`



