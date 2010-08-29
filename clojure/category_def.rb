# Definition of the Category model
class Category
  include DataMapper::Resource

  property :id, Serial
  property :category, String
  property :created_at, DateTime
end

# Migration
DataMapper.auto_migrate!
