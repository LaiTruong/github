USE [master]
GO
/****** Object:  Database [ASMJAVA]    Script Date: 07/04/2017 19:55:25 ******/
CREATE DATABASE [ASMJAVA] ON  PRIMARY 
( NAME = N'ASMJAVA', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\ASMJAVA.mdf' , SIZE = 2048KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ASMJAVA_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\ASMJAVA_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ASMJAVA] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ASMJAVA].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ASMJAVA] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [ASMJAVA] SET ANSI_NULLS OFF
GO
ALTER DATABASE [ASMJAVA] SET ANSI_PADDING OFF
GO
ALTER DATABASE [ASMJAVA] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [ASMJAVA] SET ARITHABORT OFF
GO
ALTER DATABASE [ASMJAVA] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [ASMJAVA] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [ASMJAVA] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [ASMJAVA] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [ASMJAVA] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [ASMJAVA] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [ASMJAVA] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [ASMJAVA] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [ASMJAVA] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [ASMJAVA] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [ASMJAVA] SET  DISABLE_BROKER
GO
ALTER DATABASE [ASMJAVA] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [ASMJAVA] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [ASMJAVA] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [ASMJAVA] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [ASMJAVA] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [ASMJAVA] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [ASMJAVA] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [ASMJAVA] SET  READ_WRITE
GO
ALTER DATABASE [ASMJAVA] SET RECOVERY SIMPLE
GO
ALTER DATABASE [ASMJAVA] SET  MULTI_USER
GO
ALTER DATABASE [ASMJAVA] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [ASMJAVA] SET DB_CHAINING OFF
GO
USE [ASMJAVA]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 07/04/2017 19:55:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SanPham](
	[id] [varchar](50) NOT NULL,
	[Tensp] [varchar](50) NULL,
	[Giamoi] [varchar](50) NULL,
	[Giacu] [varchar](50) NULL,
	[image] [varchar](50) NULL,
	[Mota] [varchar](400) NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[SanPham] ([id], [Tensp], [Giamoi], [Giacu], [image], [Mota]) VALUES (N'1', N'iphone-6s-128gb-hong', N'900', N'450', N'img/iphone-6s-128gb-hong.png', N'null')
INSERT [dbo].[SanPham] ([id], [Tensp], [Giamoi], [Giacu], [image], [Mota]) VALUES (N'2', N'Galaxy S5', N'400', N'200', N'img/product-thumb-1.jpg', NULL)
INSERT [dbo].[SanPham] ([id], [Tensp], [Giamoi], [Giacu], [image], [Mota]) VALUES (N'3', N'iphone-7-plus', N'800', N'600', N'img/iphone-7-plus.png', NULL)
INSERT [dbo].[SanPham] ([id], [Tensp], [Giamoi], [Giacu], [image], [Mota]) VALUES (N'4', N'htc-u-ultra', N'600', N'560', N'img/htc-u-ultra.png', NULL)
INSERT [dbo].[SanPham] ([id], [Tensp], [Giamoi], [Giacu], [image], [Mota]) VALUES (N'5', N'samsung-galaxy-s8-plus', N'800', N'780', N'img/sss8.png', NULL)
/****** Object:  Table [dbo].[Registration]    Script Date: 07/04/2017 19:55:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Registration](
	[username] [varchar](50) NOT NULL,
	[password] [varchar](10) NULL,
	[isAdmin] [bit] NULL,
	[firstname] [varchar](50) NULL,
	[lastname] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[photo] [varchar](50) NULL,
 CONSTRAINT [PK_Registration] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Registration] ([username], [password], [isAdmin], [firstname], [lastname], [Email], [photo]) VALUES (N'admin', N'admin', 0, N'AdminLT', N'Admin', N'Admin@gmail.com', N'')
INSERT [dbo].[Registration] ([username], [password], [isAdmin], [firstname], [lastname], [Email], [photo]) VALUES (N'AdminJava', N'123', 1, N'Java', N'Admin', N'AdminJav@gmail.com', N'')
INSERT [dbo].[Registration] ([username], [password], [isAdmin], [firstname], [lastname], [Email], [photo]) VALUES (N'Huongtt', N'123', 1, N'Tran', N'Huong', N'Huongtt@fe.edu.vn', N'')
INSERT [dbo].[Registration] ([username], [password], [isAdmin], [firstname], [lastname], [Email], [photo]) VALUES (N'kkk', N'kkk', 1, N'kkkk', N'kkkk', N'kkkkk', N'')
INSERT [dbo].[Registration] ([username], [password], [isAdmin], [firstname], [lastname], [Email], [photo]) VALUES (N'Lai', N'123', 1, N'Truong', N'Lai', N'Laitbps0510@fpt.edu.vn', NULL)
/****** Object:  Table [dbo].[Admin]    Script Date: 07/04/2017 19:55:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Admin](
	[ID] [varchar](50) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Admin] ([ID], [username], [password]) VALUES (N'AD', N'Admin', N'123')
INSERT [dbo].[Admin] ([ID], [username], [password]) VALUES (N'HTT', N'Huongtt', N'123')
